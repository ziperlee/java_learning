package Concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/06/08
 */

public class SynchronizedMapTest {
    public static void main(String[] args) {
        Map map = Collections.synchronizedMap(new HashMap<>());
    }
}
