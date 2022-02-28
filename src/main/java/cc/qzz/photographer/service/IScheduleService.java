package cc.qzz.photographer.service;


import cc.qzz.common.service.IService;
import cc.qzz.model.TSchedule;
import cc.qzz.vo.ScheduleVO;

/**
 * 
 * @author qzz 2022年2月
 *
 */
public interface IScheduleService extends IService<TSchedule> {

	ScheduleVO getScheduleByPhotographerId(Integer photoer_id, String year, String month);
	

}
