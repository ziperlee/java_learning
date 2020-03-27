package Concurrent;

import Util.Timer;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.iterate;
import static java.util.stream.LongStream.rangeClosed;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/03/24
 */

public class ParallelPrime {
    static final int COUNT = 100_000;

    public static boolean isPrime(long n) {
        return rangeClosed(2, (long) Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }

    public static void main(String[] args)
            throws IOException {
        Timer timer = new Timer();
        List<String> primes =
                iterate(2, i -> i + 1)
                        .parallel()              // [1]
                        .filter(ParallelPrime::isPrime)
                        .limit(COUNT)
                        .mapToObj(Long::toString)
                        .collect(Collectors.toList());
        System.out.println(timer.duration());
    }
}
