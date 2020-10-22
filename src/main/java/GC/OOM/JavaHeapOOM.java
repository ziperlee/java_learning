package GC.OOM;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms20m -Xmx20m
 *
 * @author liwei
 * @createTime 2020/06/18
 */

public class JavaHeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }

}
