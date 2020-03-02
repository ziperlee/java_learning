package Integer;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/02
 */

public class Compare {
    public static void compare1() {
        Integer a = 5;
        Integer b = 5;
        System.out.println(a == b);
        System.out.println(a != b);
    }

    public static void compare2() {
        /* == 比较的是对象的引用
         如果你把 47 改成 128，那么打印的结果就是这样，
         因为 Integer 内部维护着一个 IntegerCache 的缓存，
         默认缓存范围是 [-128, 127]，
         所以 [-128, 127] 之间的值用 == 和 != 比较也能能到正确的结果，
         但是不推荐用关系运算符比较
         */
        Integer a = 1115;
        Integer b = 1115;
        System.out.println(a == b);
        System.out.println(a != b);
    }

    public static void main(String[] args) {
        compare1();
        compare2();
    }
}
