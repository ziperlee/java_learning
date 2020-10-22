package Datastructure.Serialization;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/07/20
 */

public class Jackson {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";
        Map car = objectMapper.readValue(carJson, Map.class);
        System.out.println(car);

        System.out.println(objectMapper.writeValueAsString(car));
    }
}
