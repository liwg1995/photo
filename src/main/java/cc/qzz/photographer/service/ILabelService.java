package cc.qzz.photographer.service;

import java.util.List;

import cc.qzz.common.service.IService;
import cc.qzz.model.TLabel;

/**
 * 
 * @author qzz 2022年2月
 *
 */
public interface ILabelService extends IService<TLabel> {
	
	List<TLabel> getAllLabel();

}
