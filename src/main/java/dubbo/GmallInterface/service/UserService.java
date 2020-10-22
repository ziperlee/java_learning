package dubbo.GmallInterface.service;

import java.util.List;

import dubbo.GmallInterface.bean.UserAddress;

/**
 * 用户服务
 *
 */
public interface UserService {
	
	/**
	 * 按照用户id返回所有的收货地址
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);

}
