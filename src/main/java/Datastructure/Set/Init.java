package Datastructure.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/10
 */

public class Init {
    public static void init1() {
        Set set = new HashSet();
        Collections.addAll(set, "A B C D E F G H I J K L".split(" "));
        System.out.println(set);
        System.out.println();
    }

    public static void main(String[] args) {
        init1();
    }
}
