package cc.qzz.photographer.service;

import java.util.List;

import cc.qzz.common.service.IService;
import cc.qzz.model.TLevel;

/**
 * 
 * @author qzz 2022年2月
 *
 */
public interface ILevelService extends IService<TLevel> {

	List<TLevel> getAllLevel();

}
