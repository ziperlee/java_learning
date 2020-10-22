package dubbo.GmallInterface.service;

import java.util.List;

import dubbo.GmallInterface.bean.UserAddress;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
