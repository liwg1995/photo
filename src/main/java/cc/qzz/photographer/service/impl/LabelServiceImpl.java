package cc.qzz.photographer.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import cc.qzz.common.service.BaseService;
import cc.qzz.model.TLabel;
import cc.qzz.photographer.service.ILabelService;
import tk.mybatis.mapper.entity.Example;

/**
 * 
 * @author qzz 2022年2月
 *
 */
@Service(value = "labelService")
public class LabelServiceImpl extends BaseService<TLabel> implements ILabelService {

	@Override
	public List<TLabel> getAllLabel() {
		Example example = new Example(TLabel.class);
		example.createCriteria().andCondition("status=",0);
		return mapper.selectByExample(example);
	}

}
