package Datastructure.List;

import org.apache.commons.collections.ListUtils;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/02/25
 */

public class operation {
    // 交集
    public static void intersection() {
        List l1 = asList("hello", "hehe");
        List l2 = asList("hello", "hehe2");
        List l3 = ListUtils.intersection(l1, l2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println('\n');
    }
    // 差集
    public static void subtract() {
        List l1 = asList("hello", "hehe");
        List l2 = asList("hello", "hehe2");
        List l3 = ListUtils.subtract(l1, l2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println('\n');
    }

    // 并集
    public static void sum() {
        List l1 = asList("hello", "hehe");
        List l2 = asList("hello", "hehe2");
        List l3 = ListUtils.sum(l1, l2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println('\n');
    }

    // 合并
    public static void union() {
        List l1 = asList("hello", "hehe");
        List l2 = asList("hello", "hehe2");
        List l3 = ListUtils.union(l1, l2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println('\n');
    }


    public static void main(String[] args) {
        intersection();
        subtract();
        sum();
        union();
    }
}
