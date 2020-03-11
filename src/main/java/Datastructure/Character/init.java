package Datastructure.Character;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/01
 */

public class init {
    public static void init1() {
        char c = 'x';
        Character ch = new Character(c);
    }

    public static void init2() {
        Character ch = new Character('x');
    }

    public static void init3() {
        // 自动装箱
        Character ch = 'x';

        char c = ch;

    }
    public static void main(String[] args) {
        init1();
        init2();
        init3();
    }
}
