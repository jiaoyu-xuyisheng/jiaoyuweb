package com.jiaoyu.teacher.service;
import java.util.List;
import com.jiaoyu.pojo.Classification;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ClassificationService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Classification> findAll();
	
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Classification classification);
	
	
	/**
	 * 修改
	 */
	public void update(Classification classification);
	

	/**
	 * 根据ID获取实体
	 * @param firstId
	 * @return
	 */
	public Classification findOne(Long firstId);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Classification classification, int pageNum,int pageSize);
	
}
