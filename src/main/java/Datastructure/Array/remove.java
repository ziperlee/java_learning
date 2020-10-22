package Datastructure.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 结论，remove后index会重排，index类型为int
 * 也可以移除object，传入Integer即可
 *
 * @author liwei
 * @createTime 2020/03/23
 */

public class remove {
    public static void test1(){
        List<Integer> list = IntStream.range(1,9).boxed().collect(Collectors.toList());
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.add(10);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

        list.remove(Integer.valueOf(10));
        System.out.println(list);
    }

    public static void test2(){
        List<Integer> list = IntStream.range(1,2).boxed().collect(Collectors.toList());
        for(Integer i: list){
            System.out.println("before remove " + i);
            // list在循环中的时候是不可以删除它的元素的
            list.remove(i);
            System.out.println("after remove " + list);
        }
    }

    public static void test3(){
        List<Integer> list = IntStream.range(1,9).boxed().collect(Collectors.toList());

        System.out.println(list);
        for(Iterator it = list.iterator(); it.hasNext();){
            System.out.println("before remove " + it.next());//it.toString()异常
            it.remove();
            System.out.println("after remove " + list);
        }
    }


    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }
}
