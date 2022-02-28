package cc.qzz.photographer.service;

import java.util.List;
import java.util.Map;

import cc.qzz.common.service.IService;
import cc.qzz.model.TWorks;
import cc.qzz.vo.WorksVO;

/**
 * 
 * @author qzz 2022年2月
 *
 */
public interface IWorksService extends IService<TWorks> {

	List<Map<String,Object>> getWorksByPhotographerId(Integer id);

	WorksVO getWorks(Integer id);
	

	
}
