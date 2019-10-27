package com.jiaoyu.teacher.service;
import java.util.List;
import com.jiaoyu.pojo.Lowstart;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface LowstartService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Lowstart> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Lowstart lowstart);
	
	
	/**
	 * 修改
	 */
	public void update(Lowstart lowstart);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Lowstart findOne(Integer id);
	
	
	public Lowstart findByAnswerIdAndUserName(Integer answerid,String username);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Lowstart lowstart, int pageNum,int pageSize);
	
}
