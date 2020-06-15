package Interfaces;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/06/04
 */

public abstract class Abstract {
    public void hello(){
        System.out.println("hello");
    }
}

class HelloWorld extends Abstract{
}

class Test{
    public static void main(String[] args) {
        Abstract anAbstract = new Abstract() {
            @Override
            public void hello() {
                super.hello();
            }
        };
        anAbstract.hello();

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.hello();

        Abstract anAbstract2 = new HelloWorld();
        anAbstract2.hello();


    }
}