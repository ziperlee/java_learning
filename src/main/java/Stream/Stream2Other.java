package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream转换为其他类型
 * Stream<String>定义时若不指定类型，在Terminal时就需要类型转换
 * @author liwei
 * @createTime 2020/03/12
 */

public class Stream2Other {
    public static void toOther1() {
        // 1. Array
        Stream<String> stream = Stream.of("a", "b", "c");
        String[] strArray1 = stream.toArray(String[]::new);
    }

    public static void toOther2() {
        // 2. Collection
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of("a", "b", "c");
        Stream<String> stream3 = Stream.of("a", "b", "c");
        Stream<String> stream4 = Stream.of("a", "b", "c");
        Stream<String> stream5 = Stream.of("a", "b", "c");
        List<String> list1 = stream1.collect(Collectors.toList());
        List<String> list2 = stream2.collect(Collectors.toCollection(ArrayList::new));
        Set set1 = stream3.collect(Collectors.toSet());
        Stack stack1 = stream4.collect(Collectors.toCollection(Stack::new));
        String str = stream5.collect(Collectors.joining()).toString();
    }

    public static void toOther3() {
        // 3. String
        Stream<String> stream = Stream.of("a", "b", "c");
        String str = stream.collect(Collectors.joining());
    }

    public static void main(String[] args) {
        toOther1();
        toOther2();
        toOther3();
    }

}
