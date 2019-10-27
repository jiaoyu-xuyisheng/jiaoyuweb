package com.jiaoyu.teacher.service;
import java.util.List;
import com.jiaoyu.pojo.Secondmenu;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface SecondmenuService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Secondmenu> findAll();
	
	/**
	 * 返回父id的全部子集
	 * @param id
	 * @return
	 */
	public List<Secondmenu> findByParentId(Integer id);
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Secondmenu secondmenu);
	
	
	/**
	 * 修改
	 */
	public void update(Secondmenu secondmenu);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Secondmenu findOne(Long id);
	
	
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
	public PageResult findPage(Secondmenu secondmenu, int pageNum,int pageSize);
	
}
