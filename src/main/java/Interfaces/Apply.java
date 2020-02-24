package Interfaces;

/**
 * description
 *
 * @author liwei
 * @createTime 2019/11/10
 */

public class Apply implements Processor{
    @Override
    public String name(){
        return "hello";
    }

    @Override
    public Object process(Object input){
        return new Object();
    }


    public static void main(String[] args){
        System.out.println("hello world");
    }
}
