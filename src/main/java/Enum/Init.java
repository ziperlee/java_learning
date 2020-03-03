package Enum;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/03
 */

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}


public class Init {
    public static void init1() {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);

        for (Spiciness s: Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }

    }

    public static void main(String[] args) {
        init1();
    }

}
