package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/01/08
 */

public class Init {
    public static void init1() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list);
    }

    public static void init2() {
//        asList 是 Arrays 的静态方法，这里使用了静态导入。这种方式添加的是不可变的 List, 即不能添加、删除等操作
        List<String> list = asList("hello", "hehe");
        System.out.println(list);
//        list.add("world");
//        可以重新初始化
        List<String> list2 = new ArrayList<>(list);
        list2.add("world");
        System.out.println(list2);
    }

    public static void init3(){
//        这种方式生产的list是不可变的，若要改变同init2重新初始化
        List<String> list = Collections.nCopies(3, "hello");
        System.out.println(list);
    }

    public static void init4(){
//        匿名内部类，作用不大
        List<String> list = new ArrayList<String>() {{
            add("hello");
            add("lalala");
        }};
        list.add("world");
        System.out.println(list);
    }
    public static void init5(){
//        JDK8 Stream
        List<String> list = Stream.of("blue", "red").collect(Collectors.toList());
        list.add("haha");
        System.out.println(list);
    }

    public static void init6(){
//        JDK 9 List.of 生成的数据不可修改
//        List<String> list = List.of("a", "b", "c");
//        list.add("d");
//        System.out.println(list);
    }

    public static void main(String[] args) {
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
    }
}
