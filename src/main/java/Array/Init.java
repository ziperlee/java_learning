package Array;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/03
 */

import java.util.Arrays;
import java.util.Random;

public class Init {
    public static void init1() {
        int[] a1 = {1, 2, 3, 4, 5};
//        不能直接打印
//        System.out.println(a1);
//        System.out.println(a1.toString());
        System.out.println(Arrays.toString(a1));
//        for (int a : a1) {
//            System.out.println(a);
//        }
    }

    public static void init2() {
        Random rand = new Random(47);
        int[] a = new int[rand.nextInt(20)];
//        System.out.println(a);
        System.out.println(Arrays.toString(a));
//        for (int v : a) {
//            System.out.println(v);
//        }
//        不能用 new 创建单个的基本类型数组
    }

    public static void init3() {
        Integer[] a = {
                1, 2,
                3, // Autoboxing
        };
        Integer[] b = new Integer[]{
                1, 2,
                3, // Autoboxing
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static void init4(Object... args) {
//      可变的参数列表
        System.out.println(Arrays.toString(args));
    }

    public static void main(String[] args) {
        init1();
        init2();
        init3();
        init4("one", "two", "three");
    }
}
