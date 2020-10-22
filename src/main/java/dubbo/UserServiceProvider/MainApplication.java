package dubbo.UserServiceProvider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/10/12
 */

public class MainApplication {
    public static void main(String[] args) {
//        File file = new File("src/main/java/dubbo/UserServiceProvider/resources/provider.xml");
//        String path = file.getAbsolutePath();

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
