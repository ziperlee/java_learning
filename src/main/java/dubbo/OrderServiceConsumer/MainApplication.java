package dubbo.OrderServiceConsumer;

import dubbo.GmallInterface.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/10/12
 */

public class MainApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = applicationContext.getBean(OrderService.class);

        orderService.initOrder("1");
        System.out.println("调用完成....");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
