package Array;

import org.apache.commons.beanutils.ConvertUtils;

import java.util.Arrays;
import java.util.List;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/02/24
 */

public class Transformation {
    public static void trans1() {
//        String[] -> List<String>
        String key = "1,2,3";
        List<String> tmp = Arrays.asList(key.split(","));
        System.out.println(tmp);
    }

    public static void trans2() {
        String key = "1,2,3";
        //        String[] -> List<Interger>
        List<Integer> tmp2 = Arrays.asList((Integer[]) ConvertUtils.convert(key.split(","), Integer.class));
        System.out.println(tmp2);
    }

    public static void trans3() {
        int[] a1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a1));
    }

    public static void main(String[] args) {
        trans1();
        trans2();
        trans3();
    }
}
