package GC.OOM;

import jdk.internal.org.objectweb.asm.Opcodes;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import com.sun.xml.internal.ws.org.objectweb.asm.ClassWriter;

import java.lang.reflect.Method;

/**
 * -XX:PermSize=10M -XX:MaxPermSize=10M //java8后永久代已经不存在
 * -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
 *
 * @author liwei
 * @createTime 2020/06/18
 */

public class JavaMetaspaceOOM extends ClassLoader{
    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                public Object intercept(Object obj, Method method,
                                        Object[] args, MethodProxy proxy) throws Throwable {
                    return proxy.invokeSuper(obj, args);
                }
            });
            enhancer.create();
        }
    }
    static class OOMObject {
    }

    public static void otherWay(){
        int j = 0;
        try {
            JavaMetaspaceOOM test = new JavaMetaspaceOOM();
            for (int i = 0; i < 10000; i++) {
                //创建ClassWriter对象，用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                //指明版本号，修饰符，类名，包名，父类，接口
                classWriter.visit(Opcodes.V1_6, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                //返回byte[]
                byte[] code = classWriter.toByteArray();
                //类的加载
                test.defineClass("Class" + i, code, 0, code.length);//Class对象
                j++;
            }
        } finally {
            System.out.println(j);
        }
    }

}
