package dubbo.BootOrderServiceConsumer;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/10/13
 */

import dubbo.OrderServiceConsumer.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;

@EnableDubbo
//@EnableHystrix
@SpringBootApplication
class BootOrderServiceConsumerApplication {
    @Autowired
    OrderServiceImpl orderService;

    public static void main(String[] args) {
        SpringApplication.run(BootOrderServiceConsumerApplication.class, args);
    }
}
