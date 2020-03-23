package Datastructure.List;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.collections.ListUtils;

import Generics.Suppliers;

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
//        asList 是 Arrays 的静态方法，这里使用了静态导入。这种方式添加的是不可变的 Datastructure.List, 即不能添加、删除等操作
        List<String> list = asList("hello", "hehe");
        System.out.println(list);
//        list.add("world");
//        可以重新初始化
        List<String> list2 = new ArrayList<>(list);
        list2.add("world");
        System.out.println(list2);
    }

    public static void init3() {
//        这种方式生产的list是不可变的，若要改变同init2重新初始化
        List<String> list = Collections.nCopies(3, "hello");
        System.out.println(list);
    }

    public static void init4() {
//        匿名内部类，作用不大
        List<String> list = new ArrayList<String>() {{
            add("hello");
            add("lalala");
        }};
        list.add("world");
        System.out.println(list);
    }

    public static void init5() {
//        JDK8 Stream
        List<String> list = Stream.of("blue", "red").collect(Collectors.toList());
        list.add("haha");
        System.out.println(list);
    }

    public static void init6() {
//        JDK 9 Datastructure.List.of 生成的数据不可修改
//        Datastructure.List<String> list = Datastructure.List.of("a", "b", "c");
//        list.add("d");
//        System.out.println(list);
    }

    public static void init7() {
        List l1 = asList("hello", "hehe");
        List l2 = asList("hello", "hehe2");
        List l3 = ListUtils.intersection(l1, l2);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }

    public static void init8() {
        List range = IntStream.rangeClosed(1, 10)
                .boxed().collect(Collectors.toList());
        System.out.println(range);
        System.out.println(' ');
    }

    public static void init9() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);
        System.out.println(' ');
    }

    public static void init10() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        左开右闭，index从0开始
        List<Integer> subList = list.subList(1, 3);
        System.out.println(subList);
    }

    public static void init11() {
        List<Random> sphereList = Suppliers.create(
                ArrayList::new, Random::new, 5);
    }

    public static void main(String[] args) {
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
        init7();
        init8();
        init9();
        init10();
    }
}
