package Stream;

import java.util.stream.Stream;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/14
 */

public class StreamComp2ParallelStream {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9).forEach(System.out::println);
        System.out.println();
//        使用parallel后无法保证处理顺序
        Stream.of(1,2,3,4,5,6,7,8,9).parallel().forEach(System.out::println);
    }
}
