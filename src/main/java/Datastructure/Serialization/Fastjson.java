package Datastructure.Serialization;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/07/20
 */

public class Fastjson {
    public static void main(String[] args) {
        // String -> Object
        String str = "{\"code\": \"success\", \"data\": {\"assistantList\": [{\"courseConfigDraftId\": 4174, \"value\": \"\"}], \"courseType\": 1, \"chapterList\": [{\"chapterName\": \"222222222222\", \"lessonList\": [{\"assistantList\": [{\"courseConfigDraftId\": 4173, \"value\": \"\"}], \"documentList\": [], \"playbackAble\": 0, \"lessonId\": 1054, \"teacherList\": [{\"courseConfigDraftId\": 4172, \"value\": \"\"}], \"startTime\": 1590595200000, \"lessonType\": 1, \"trialAble\": 0, \"lessonDraftId\": 1472, \"lessonName\": \"\\u54d2\\u54d2\\u54d2\\u54d2\\u54d2\\u54d2\\u591a\\u591a\\u591a\"}, {\"assistantList\": [{\"courseConfigDraftId\": 4179, \"value\": \"\"}], \"documentList\": [], \"playbackAble\": 0, \"lessonId\": 1055, \"teacherList\": [{\"courseConfigDraftId\": 4178, \"value\": \"\"}], \"lessonType\": 0, \"trialAble\": 0, \"lessonDraftId\": 1473, \"lessonName\": \"4444444444444444\"}, {\"assistantList\": [{\"courseConfigDraftId\": 4181, \"value\": \"\"}], \"documentList\": [], \"playbackAble\": 0, \"lessonId\": 1056, \"teacherList\": [{\"courseConfigDraftId\": 4180, \"value\": \"\"}], \"startTime\": 1590595200000, \"lessonType\": 1, \"trialAble\": 0, \"lessonDraftId\": 1474, \"lessonName\": \"111\"}], \"chapterDraftId\": 428}], \"courseDraftId\": 463, \"teacherConfigType\": 0, \"teacherList\": [{\"courseConfigDraftId\": 4175, \"value\": \"11111111111\"}], \"version\": 14, \"recommendCourseList\": [{\"courseConfigDraftId\": 4176, \"value\": \"89\"}, {\"courseConfigDraftId\": 4177, \"value\": \"87\"}]}, \"success\": true, \"desc\": null}";
        HashMap map = JSON.parseObject(str, HashMap.class);
        System.out.println(map);

    }
}
