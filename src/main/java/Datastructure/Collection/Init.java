package Datastructure.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/10
 */

public class Init {
    public static void init1() {
        Collection<Integer> collection = new ArrayList<>();
        for (Integer i = 0; i < 10; i++) {
            collection.add(i);
        }
        System.out.println(collection);
    }

    public static void main(String[] args) {
        init1();
    }
}
