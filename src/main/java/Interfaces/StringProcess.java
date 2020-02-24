package Interfaces;

/**
 * description
 *
 * @author liwei
 * @createTime 2019/11/10
 */

public abstract class StringProcess implements Processor{
    @Override
    public String name(){
        return getClass().getSimpleName();
    }

//    @Override
//    public abstract Object process(Object input);

    public static void main(String args[]){
        System.out.println("hello world");
    }
}
