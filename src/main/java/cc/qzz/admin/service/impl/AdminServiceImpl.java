package cc.qzz.admin.service.impl;


import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import cc.qzz.admin.service.IAdminService;
import cc.qzz.common.service.BaseService;
import cc.qzz.common.util.Md5CryptUtil;
import cc.qzz.model.TAdmin;
import tk.mybatis.mapper.entity.Example;

/**
 * 
 * @author qzz 2022年2月
 *
 */
@Service(value="adminService")
public class AdminServiceImpl extends BaseService<TAdmin> implements IAdminService{

	

	@Override
	public TAdmin login(TAdmin admin) {
		if(StringUtils.isBlank(admin.getName()) || StringUtils.isBlank(admin.getPassword())) return null;
		admin.setPassword(Md5CryptUtil.getMD5String(admin.getPassword()));
		Example example = new Example(TAdmin.class);
		example.createCriteria().andCondition("name = ", admin.getName()).andCondition("password = " , admin.getPassword());
		List<TAdmin> list = mapper.selectByExample(example);
		if(list.isEmpty()){
			return null;
		}else{
			return list.get(0);
		}
		
	}

	
}
