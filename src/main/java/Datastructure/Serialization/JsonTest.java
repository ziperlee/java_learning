package Datastructure.Serialization;

import com.alibaba.fastjson.JSON;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/07/16
 */

public class JsonTest {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "{\"code\": \"success\", \"data\": {\"assistantList\": [{\"courseConfigDraftId\": 4174, \"value\": \"\"}], \"courseType\": 1, \"chapterList\": [{\"chapterName\": \"222222222222\", \"lessonList\": [{\"assistantList\": [{\"courseConfigDraftId\": 4173, \"value\": \"\"}], \"documentList\": [], \"playbackAble\": 0, \"lessonId\": 1054, \"teacherList\": [{\"courseConfigDraftId\": 4172, \"value\": \"\"}], \"startTime\": 1590595200000, \"lessonType\": 1, \"trialAble\": 0, \"lessonDraftId\": 1472, \"lessonName\": \"\\u54d2\\u54d2\\u54d2\\u54d2\\u54d2\\u54d2\\u591a\\u591a\\u591a\"}, {\"assistantList\": [{\"courseConfigDraftId\": 4179, \"value\": \"\"}], \"documentList\": [], \"playbackAble\": 0, \"lessonId\": 1055, \"teacherList\": [{\"courseConfigDraftId\": 4178, \"value\": \"\"}], \"lessonType\": 0, \"trialAble\": 0, \"lessonDraftId\": 1473, \"lessonName\": \"4444444444444444\"}, {\"assistantList\": [{\"courseConfigDraftId\": 4181, \"value\": \"\"}], \"documentList\": [], \"playbackAble\": 0, \"lessonId\": 1056, \"teacherList\": [{\"courseConfigDraftId\": 4180, \"value\": \"\"}], \"startTime\": 1590595200000, \"lessonType\": 1, \"trialAble\": 0, \"lessonDraftId\": 1474, \"lessonName\": \"111\"}], \"chapterDraftId\": 428}], \"courseDraftId\": 463, \"teacherConfigType\": 0, \"teacherList\": [{\"courseConfigDraftId\": 4175, \"value\": \"11111111111\"}], \"version\": 14, \"recommendCourseList\": [{\"courseConfigDraftId\": 4176, \"value\": \"89\"}, {\"courseConfigDraftId\": 4177, \"value\": \"87\"}]}, \"success\": true, \"desc\": null}";
        HashMap map = JSON.parseObject(str, HashMap.class);
        System.out.println(map);

        parseJson(map.get("data"), "");
        System.out.println(list.stream().collect(Collectors.joining("&")));

//        System.out.println(stampToDate("1590595200000"));
    }

    public static void parseJson(Object param, String prifix) throws UnsupportedEncodingException {
        if (param instanceof Map) {
            for (Map.Entry<String, Object> entry : ((Map<String, Object>) param).entrySet()) {
                parseJson(entry.getValue(), prifix + entry.getKey());
            }
        } else if (param instanceof List) {
            List list = (List) param;
            for (Object entry : list) {
                int idx = list.indexOf(entry);
                parseJson(entry, prifix + "[" + idx + "].");
            }
        } else {
            if (String.valueOf(prifix).contains("Time")) {
                param = timeParse(String.valueOf(param));
            }
            String str = prifix + "=" + param;
            list.add(str);
        }
    }

    public static String timeParse(String s) throws UnsupportedEncodingException {
        DateFormat dateFormat = new SimpleDateFormat("E MMM dd yyyy HH:mm:ss z+0800", Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = new Date(new Long(s));
        String formatedData = dateFormat.format(date);
        return URLEncoder.encode(formatedData, "UTF-8");
    }
}
