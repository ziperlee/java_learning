package Datastructure.Enum;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/03
 */

enum Spiciness {
    NOT("可以添加描述"), MILD(""), MEDIUM(""), HOT(""), FLAMING("");
    private String description;
    private Spiciness(String description){
        this.description = description;
    }

}


public class Init {
    public static void init1() {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);

        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }

    }

    public static void init2() {
        for(String s :
                "NOT MILD MEDIUM HOT FLAMING".split(" ")) {
            Spiciness spic =
                    Enum.valueOf(Spiciness.class, s);
            System.out.println(spic);
        }
    }

    public static void main(String[] args) {
        init1();
        init2();
    }

}
