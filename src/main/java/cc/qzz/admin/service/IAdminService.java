package cc.qzz.admin.service;

import cc.qzz.common.service.IService;
import cc.qzz.model.TAdmin;

/**
 * 
 * @author qzz 2022年2月
 *
 */
public interface IAdminService extends IService<TAdmin> {
	
	TAdmin login(TAdmin admin);

}
