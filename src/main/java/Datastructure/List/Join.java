package Datastructure.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/07/20
 */

public class Join {
    public static void main(String[] args) {
        List<Map> schemaColumns = new ArrayList();
        String columns = schemaColumns.stream().map(o -> (String) o.get("data_name")).collect(Collectors.joining(","));
        System.out.println(columns);
    }
}
