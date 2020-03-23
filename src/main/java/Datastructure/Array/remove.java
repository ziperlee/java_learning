package Datastructure.Array;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 结论，remove后index会重排，index类型为int
 * 也可以移除object，传入Integer即可
 *
 * @author liwei
 * @createTime 2020/03/23
 */

public class remove {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1,9).boxed().collect(Collectors.toList());
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.add(10);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

        list.remove(Integer.valueOf(10));
        System.out.println(list);
    }
}
