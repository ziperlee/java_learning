package GC.OOM;

/**
 * -Xss160k
 *
 * @author liwei
 * @createTime 2020/06/18
 */

public class JavaVMStackSOF {
    private int stackLength = 1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        oom.stackLeak();
    }

}
