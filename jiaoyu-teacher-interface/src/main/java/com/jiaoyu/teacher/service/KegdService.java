package com.jiaoyu.teacher.service;
import java.util.List;
import com.jiaoyu.pojo.Kegd;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface KegdService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Kegd> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Kegd kegd);
	
	
	/**
	 * 修改
	 */
	public void update(Kegd kegd);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Kegd findOne(Long id);
	
	
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
	public PageResult findPage(Kegd kegd, int pageNum,int pageSize);
	
}
