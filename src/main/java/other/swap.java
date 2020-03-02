package other;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/02/28
 */

public class swap {
    public static void swap1() {
        int a = 2;
        int b = 1;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        swap1();
    }
}
