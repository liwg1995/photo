package cc.qzz.photographer.service.impl;


import org.springframework.stereotype.Service;

import cc.qzz.common.service.BaseService;
import cc.qzz.model.TAttachment;
import cc.qzz.photographer.service.IAttachmentService;

/**
 * 
 * @author qzz 2022年2月
 *
 */
@Service(value = "attachmentService")
public class AttachmentServiceImpl extends BaseService<TAttachment> implements IAttachmentService {

}
