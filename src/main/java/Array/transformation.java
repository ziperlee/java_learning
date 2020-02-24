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

public class transformation {
    public static void main(String[] args) {
//        String[] -> List<String>
        String key = "1,2,3";
        List<String> tmp = Arrays.asList(key.split(","));
        System.out.println(tmp);

//        String[] -> List<Interger>
        List<Integer> tmp2 = Arrays.asList((Integer[]) ConvertUtils.convert(key.split(","), Integer.class));
        System.out.println(tmp2);
    }
}
