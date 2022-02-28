package cc.qzz.banner.service.impl;


import org.springframework.stereotype.Service;

import cc.qzz.banner.service.IBannerService;
import cc.qzz.common.service.BaseService;
import cc.qzz.model.TBanner;

/**
 * 
 * @author qzz 2022年2月
 *
 */
@Service(value = "bannerService")
public class BannerServiceImpl extends BaseService<TBanner> implements IBannerService {

}
