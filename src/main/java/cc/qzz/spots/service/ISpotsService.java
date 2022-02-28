package cc.qzz.spots.service;

import java.util.List;

import cc.qzz.common.service.IService;
import cc.qzz.model.TSpots;

/**
 * 
 * @author qzz 2022年2月
 *
 */
public interface ISpotsService extends IService<TSpots> {
	
	List<TSpots> getAllSpots();
}
