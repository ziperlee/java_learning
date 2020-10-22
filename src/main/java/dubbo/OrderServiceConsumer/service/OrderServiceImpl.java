package dubbo.OrderServiceConsumer.service;

import dubbo.GmallInterface.bean.UserAddress;
import dubbo.GmallInterface.service.OrderService;
import dubbo.GmallInterface.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author liwei
 * @createTime 2020/10/12
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }

}
