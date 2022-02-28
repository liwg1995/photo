package cc.qzz.comment.service.impl;


import org.springframework.stereotype.Service;

import cc.qzz.comment.service.ICommentService;
import cc.qzz.common.service.BaseService;
import cc.qzz.model.TComment;

/**
 * 
 * @author hzc 2017年3月1日
 *
 */
@Service(value = "commentService")
public class CommentServiceImpl extends BaseService<TComment> implements ICommentService {


}
