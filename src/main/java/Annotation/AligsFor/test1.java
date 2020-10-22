package Annotation.AligsFor;

//import org.junit.Assert;
//import org.junit.Test;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.function.Consumer;


/**
 * description
 *
 * @author liwei
 * @createTime 2020/05/07
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAliasAnnotation {
//    在同一个注解内，对两个不同的属性一起使用，互为别名，两个属性的值&默认值必须相同
    @AliasFor(value = "location")
    String value() default "";

    @AliasFor(value = "value")
    String location() default "";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAliasAnnotation2 {
    //    为其它注解别名
    @AliasFor(value = "value", annotation = MyAliasAnnotation.class)
    String value2() default "";

    @AliasFor(value = "location", annotation = MyAliasAnnotation.class)
    String location2() default "";
}

//传递别名（跟场景2很类似）：再来看NewRM：


//编写测试类
class MyClass {

    @MyAliasAnnotation(location = "one")
    public static void one() {
    }

    @MyAliasAnnotation(value = "one2")
    public static void one2() {
    }
}

class MyClass2 {

    @MyAliasAnnotation2(location2 = "one")
    public static void one() {
    }

    @MyAliasAnnotation2(value2 = "one2")
    public static void one2() {
    }
}


public class test1 {

    @Test
    public void test1() throws NoSuchMethodException {
        Consumer<MyAliasAnnotation> logic = a -> {
//            Assert.assertTrue("", "这是值".equals(a.value()));
//            Assert.assertTrue("", a.value().equals(a.location()));
            System.out.println("value()=" + a.value());
            System.out.println("location()=" + a.location());
        };

        MyAliasAnnotation aliasAnnotation = AnnotationUtils.findAnnotation(MyClass.class.getMethod("one"), MyAliasAnnotation.class);
        logic.accept(aliasAnnotation);

        MyAliasAnnotation aliasAnnotation2 = AnnotationUtils.findAnnotation(MyClass.class.getMethod("one2"), MyAliasAnnotation.class);
        logic.accept(aliasAnnotation2);

    }

    @Test
    public void test2() throws NoSuchMethodException {
        Consumer<MyAliasAnnotation2> logic = a -> {
            System.out.println("value()=" + a.value2());
            System.out.println("location()=" + a.location2());
        };

        MyAliasAnnotation2 aliasAnnotation = AnnotationUtils.findAnnotation(MyClass2.class.getMethod("one"), MyAliasAnnotation2.class);
        logic.accept(aliasAnnotation);

        MyAliasAnnotation2 aliasAnnotation2 = AnnotationUtils.findAnnotation(MyClass2.class.getMethod("one2"), MyAliasAnnotation2.class);
        logic.accept(aliasAnnotation2);

    }


}
