package Datastructure.Collection;

import java.util.*;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/10
 */

public class Operation {
    public static void op1() {
        List<String> list1 = new ArrayList<String>() {{
            add("hello");
            add("lalala");
        }};
        List<String> list2 = new ArrayList<String>() {{
            add("hello2");
            add("lalala2");
        }};
//        Collections.addAll(list1, list2); 只适用于Collection类型，比如Set
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "A B C D E F G H I J K L".split(" "));
        System.out.println(set);
    }

    public static void main(String[] args) {
        op1();
    }
}
