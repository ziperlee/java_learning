package Typeinfo.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 不仅动态创建代理对象而且动态处理对代理方法的调用
 * 在动态代理上进行的所有调用都被重定向到单个调用处理程序，
 * 该处理程序负责发现调用的内容并决定如何处理
 *
 * 可以通过调用静态方法 Proxy.newProxyInstance() 来创建动态代理，
 * 该方法需要一个类加载器（通常可以从已加载的对象中获取），
 * 希望代理实现的接口列表（不是类或抽象类），
 * 以及接口 InvocationHandler 的一个实现。
 * 动态代理会将所有调用重定向到调用处理程序，
 * 因此通常为调用处理程序的构造函数提供对“真实”对象的引用，
 * 以便一旦执行中介任务便可以转发请求
 *
 * @author liwei
 * @createTime 2020/03/15
 */

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object
    invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println(
                "**** proxy: " + proxy.getClass() +
                        ", method: " + method + ", args: " + args);
        if (args != null)
            for (Object arg : args)
                System.out.println("  " + arg);
        return method.invoke(proxied, args);
    }
}

class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // Insert a proxy and call again:
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
