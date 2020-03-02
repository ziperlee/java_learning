package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/02/27
 */

public class init {
    public static void init1() {
        System.out.println("init1");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "June");
        map.put("age", 12);
        System.out.println(map);
    }

    public static void init2() {
        System.out.println("init2");
        Map<String, Object> map = new HashMap<String, Object>() {
            {
                put("name", "June");
                put("age", 13);
            }
        };
        System.out.println(map);
    }

    public static void init3() {
        // =, 引用-浅拷贝
        System.out.println("init3");
        Map map = new HashMap();
        map.put("name", "June");
        Map map2 = new HashMap();
        map2 = map;
        map2.put("age", 12);

        System.out.println(map);
        System.out.println(map2);
    }

    public static void init4() {
        // Map.putAll, 浅拷贝
        List<String> list = new ArrayList<>();
        list.add("hello");

        System.out.println("init4");
        Map map = new HashMap();
        map.put("name", "June");
        map.put("list", list);

        Map map2 = new HashMap();
        map2.putAll(map);
        map2.put("age", 12);
        list.add("world");

        System.out.println(map);
        System.out.println(map2);
    }

    public static void init5() {
        // HashMap.putAll, 浅拷贝
        List<String> list = new ArrayList<>();
        list.add("hello");

        System.out.println("init5");
        HashMap map = new HashMap();
        map.put("name", "June");
        map.put("list", list);

        HashMap map2 = new HashMap();
        map2.put("sex", "girl");
        map2.putAll(map);
        map2.put("age", 12);
        list.add("world");

        System.out.println(map);
        System.out.println(map2);
    }

    public static void main(String[] args) {
        init1();
        init2();
        init3();
        init4();
        init5();
    }
}
