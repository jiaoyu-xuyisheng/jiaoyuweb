package com.jiaoyu.teacher.service;
import java.util.List;
import com.jiaoyu.pojo.Jyuser;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface JyuserService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Jyuser> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Jyuser jyuser);
	
	
	/**
	 * 修改
	 */
	public void update(Jyuser jyuser);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Jyuser findOne(String username);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(String [] usernames);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Jyuser jyuser, int pageNum,int pageSize);
	
}
