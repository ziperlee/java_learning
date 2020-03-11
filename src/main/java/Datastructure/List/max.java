package Datastructure.List;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/02/24
 */

public class max {
    public static void main(String[] args) {
        List<String> tmp = asList("1", "2", "3");
        System.out.println(Collections.max(tmp));
    }
}
