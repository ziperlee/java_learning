package Stream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/11
 */

public class Init {
    /**
     * 1、Stream.of
     */
    public static void init1() {
        Stream.of(1, 2, 3).forEach(System.out::println);
        Stream.of("a", "b", "c").forEach(System.out::println);
        System.out.println();
    }

    /**
     * 2、Collections集合转换为流
     */
    public static void init2() {
        Set<String> w = new HashSet<>(Arrays.asList("It's a wonderful day for pie!".split(" ")));
        w.stream()
                .map(x -> x + " ")
                .forEach(System.out::print);
        System.out.println();

        Map<String, Double> m = new HashMap<>();
        m.put("pi", 3.14159);
        m.put("e", 2.718);
        m.put("phi", 1.618);
        // 注意必须使用entrySet
        m.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .forEach(System.out::println);
        System.out.println(m.entrySet());
        System.out.println();
    }

    public static <T> void show(Stream<T> stream) {
        stream
                .limit(4)
                .forEach(System.out::println);
        System.out.println("++++++++");
    }

    /**
     * 3、Random
     */
    public static void init3() {
        Random rand = new Random(47);
        show(rand.ints().boxed());
        // 控制上限和下限：
        show(rand.ints(10, 20).boxed());
        // 控制流大小(数量)：
        show(rand.ints(2).boxed());
        // 控制流的大小和界限
        show(rand.ints(3, 3, 9).boxed());
    }

    /**
     * range
     */
    public static void init4() {
        System.out.println(range(10, 20).sum());
        System.out.println();
    }

    /**
     * 4、Stream.generate
     * 必须覆盖get
     */
    public static void init5() {
        class Generator implements Supplier<String> {
            Random rand = new Random(47);
            char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

            @Override
            public String get() {
                return "" + letters[rand.nextInt(letters.length)];
            }
        }
        String word = Stream.generate(new Generator())
                .limit(30)
                .collect(Collectors.joining());

        Stream.generate(() -> "duplicate")
                .limit(3)
                .forEach(System.out::println);

        System.out.println(word);

    }

    /**
     * 5、Stream.iterate
     */
    public static void init6() {
        class Fibonacci {
            int x = 1;

            Stream<Integer> numbers() {
                return Stream.iterate(0, i -> {
                    int result = x + i;
                    x = i;
                    return result;
                });
            }
        }
        new Fibonacci().numbers()
                .skip(20) // 过滤前 20 个
                .limit(10) // 然后取 10 个
                .forEach(System.out::println);
        System.out.println();
    }

    /**
     * 6、Stream.builder
     * 流的建造者模式
     */
    public static void init7() {
        class FileToWordsBuilder {
            Stream.Builder<String> builder = Stream.builder();

            public FileToWordsBuilder(String filePath) throws Exception {
                Files.lines(Paths.get(filePath))
                        .skip(1) // 略过开头的注释行
                        .forEach(line -> {
                            for (String w : line.split("[ .?,]+"))
                                builder.add(w);
                        });
            }

            Stream<String> stream() {
                return builder.build();
            }
        }
        try {
            new FileToWordsBuilder("Cheese.dat")
                    .stream()
                    .limit(7)
                    .map(w -> w + " ")
                    .forEach(System.out::print);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }

    /**
     * 7、Arrays.stream
     */
    public static void init8() {
        // 选择一个子域:
        Arrays.stream(new int[] { 1, 3, 5, 7, 15, 28, 37 }, 3, 6)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
    }

    /**
     * 8.IntStream, LongStream, DoubleStream
     */
    public static void init9(){
        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
        IntStream.range(1, 3).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
        init7();
    }
}
