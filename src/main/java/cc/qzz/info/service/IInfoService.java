package cc.qzz.info.service;

import java.util.List;

import cc.qzz.common.service.IService;
import cc.qzz.model.TInfomation;

/**
 * 
 * @author qzz 2022年2月
 *
 */
public interface IInfoService extends IService<TInfomation> {
	
	List<TInfomation> getAllInfo();
}
