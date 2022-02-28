package cc.qzz.user.service;

import cc.qzz.common.service.IService;
import cc.qzz.model.TUser;

/**
 * 
 * @author qzz 2022年2月
 *
 */
public interface IUserService extends IService<TUser> {
	
	TUser login(TUser user);

	int register(TUser user);
	
	boolean checkUserByName(String name);
	
	int updatePassword(TUser user);
}
