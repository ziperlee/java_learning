package Datastructure.Serialization;

import com.alibaba.fastjson.JSONPath;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/07/30
 */

class test {
    public static void main(String[] args) {
//        Map a = JsonUtil.jsonToMap("{\"1\": 1, \"2\": {\"3\": 3}}");
//        System.out.println(((Map)a.get("2")).get("3"));
        String responseStr = "{\"code\": 1, \"success\": true, \"message\": \"\", \"data\": {\"total\": 1, \"page_num\": 1, \"page_size\": 1, \"list\": [{\"table_id\": \"\", \"table_name\": \"aaa\", \"table_type\": \"BASE\", \"sync_period\": \"\", \"sec_domain\": \"\", \"table_desc\": \"\", \"create_time\": \"\"}]}}";
//        Map response = JsonUtil.jsonToMap(responseStr);
//
//        if (false == (boolean) response.get("success")) {
//            System.out.println("flase...");
//            return ;
//        }
//
//        List<String> tableList = (List) ((Map) response.get("data")).get("list");
//        List<String> tables = tableList.stream().map(info -> {
//            return (String)JsonUtil.jsonToMap(info).get("table_name");
//        }).collect(Collectors.toList());
//        System.out.println(tables);

        boolean success = (boolean) JSONPath.read(responseStr, "$.success");
        System.out.println(success);
        List tables = (List) JSONPath.read(responseStr, "$.data.list[*].table_name");
        System.out.println(tables);
    }
}
