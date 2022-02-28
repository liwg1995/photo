package cc.qzz.photographer.service;

import java.text.ParseException;
import java.util.List;

import cc.qzz.common.service.IService;
import cc.qzz.model.TPhotographer;

/**
 * 
 * @author qzz 2022年2月
 *
 */
public interface IPhotographerService extends IService<TPhotographer> {

	List<String> selectByStartEnd(String start, String end) throws IllegalArgumentException, ParseException;
}
