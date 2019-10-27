package com.jiaoyu.teacher.service;
import java.util.List;
import com.jiaoyu.pojo.Kelist;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface KelistService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Kelist> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Kelist kelist);
	
	
	/**
	 * 修改
	 */
	public void update(Kelist kelist);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Kelist findOne(Long id);
	

	
	
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
	public PageResult findPage(Kelist kelist, int pageNum,int pageSize);


	public List<Kelist> findKeByKeId(Integer keid);
	
}
