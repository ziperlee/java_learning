package Validating;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/11
 */

public class SimpleDebugging {
    private static void foo1() {
        System.out.println("In foo1");
        foo2();
    }

    private static void foo2() {
        System.out.println("In foo2");
        foo3();
    }

    private static void foo3() {
        System.out.println("In foo3");
        int j = 1;
        j--;
        int i = 5 / j;
    }

    public static void main(String[] args) {
        foo1();
    }
}
