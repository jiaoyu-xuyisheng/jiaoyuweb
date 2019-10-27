package com.jiaoyu.teacher.service;
import java.util.List;
import com.jiaoyu.pojo.Shoucang;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ShoucangService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Shoucang> findAll();
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Shoucang> findShoucangList(String username);
	
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Shoucang shoucang);
	
	
	/**
	 * 修改
	 */
	public void update(Shoucang shoucang);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Shoucang findOne(Integer id);
	
	
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
	public PageResult findPage(Shoucang shoucang, int pageNum,int pageSize);
	
}
