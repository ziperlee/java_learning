package Datastructure.Array;

import java.util.Arrays;
import java.util.SplittableRandom;

/**
 * 多维数组
 *
 * @author liwei
 * @createTime 2020/03/19
 */

public class MutiArray {
    static int val = 1;

    public static void init1() {
        int[][] a = {
                {1, 2, 3,},
                {4, 5, 6,},
        };
//        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));

    }

    public static void init2() {
        SplittableRandom rand = new SplittableRandom(47);
        // 3-D array with varied-length vectors:
        int[][][] a = new int[rand.nextInt(7)][][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[rand.nextInt(5)][];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new int[rand.nextInt(5)];
                Arrays.setAll(a[i][j], n -> val++); // [1]
            }
        }
        System.out.println(Arrays.deepToString(a));
    }

    public static void init3() {
        Integer[][] a = { // Autoboxing:
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
        };
        System.out.println(Arrays.deepToString(a));
    }

    public static void init4() {
        int[] a = new int[8];
        Arrays.setAll(a, n -> n);
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        init1();
        init2();
        init3();
        init4();
    }
}
