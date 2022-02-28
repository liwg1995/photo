package cc.qzz.photographer.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import cc.qzz.common.service.BaseService;
import cc.qzz.model.TLevel;
import cc.qzz.photographer.service.ILevelService;
import tk.mybatis.mapper.entity.Example;

/**
 * 
 * @author qzz 2022年2月
 *
 */
@Service(value = "levelService")
public class LevelServiceImpl extends BaseService<TLevel> implements ILevelService {

	@Override
	public List<TLevel> getAllLevel() {
		Example example = new Example(TLevel.class);
		example.createCriteria().andCondition("status=",0);
		return mapper.selectByExample(example);
	}

}
