package String;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 使用正则表达式或 Scanner 对象，我们能够以更加复杂的模式来分割一个字符串，
 * 而这对于 StringTokenizer 来说就很困难了。
 * 基本上，我们可以放心地说，StringTokenizer 已经可以废弃不用了
 *
 * @author liwei
 * @createTime 2020/03/15
 */

public class ReplacingStringTokenizer {
    public static void main(String[] args) {
        String input = "But I'm not dead yet! I feel happy!";
        StringTokenizer stoke = new StringTokenizer(input);
        while (stoke.hasMoreElements())
            System.out.print(stoke.nextToken() + " ");
        System.out.println();

        System.out.println(Arrays.toString(input.split(" ")));

        Scanner scanner = new Scanner(input);
        while (scanner.hasNext())
            System.out.print(scanner.next() + " ");
    }
}
