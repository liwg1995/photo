package cc.qzz.info.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import cc.qzz.common.service.BaseService;
import cc.qzz.info.service.IInfoService;
import cc.qzz.model.TInfomation;
import tk.mybatis.mapper.entity.Example;

/**
 * 
 * @author qzz 2022年2月
 *
 */
@Service(value = "infoService")
public class InfoServiceImpl extends BaseService<TInfomation> implements IInfoService {

	@Override
	public List<TInfomation> getAllInfo() {
		Example example = new Example(TInfomation.class);
		example.createCriteria().andCondition("status=",0);
		return mapper.selectByExample(example);
	}

}
