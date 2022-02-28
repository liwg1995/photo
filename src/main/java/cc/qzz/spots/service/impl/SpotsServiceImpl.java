package cc.qzz.spots.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import cc.qzz.common.service.BaseService;
import cc.qzz.model.TSpots;
import cc.qzz.spots.service.ISpotsService;
import tk.mybatis.mapper.entity.Example;

/**
 * 
 * @author qzz 2022年2月
 *
 */
@Service(value = "spotsService")
public class SpotsServiceImpl extends BaseService<TSpots> implements ISpotsService {

	@Override
	public List<TSpots> getAllSpots() {
		Example example = new Example(TSpots.class);
		example.createCriteria().andCondition("status=",0);
		
		return mapper.selectByExample(example);
	}

	
}
