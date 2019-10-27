package com.jiaoyu.teacher.service;
import java.util.List;
import com.jiaoyu.pojo.Upstart;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface UpstartService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Upstart> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Upstart upstart);
	
	
	/**
	 * 修改
	 */
	public void update(Upstart upstart);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Upstart findOne(Integer id);
	
	
	/**
	 * 通过点赞用户找对象！！
	 * @param username
	 * @return
	 */
	public Upstart findOneByUsernameAndAnswerId(Integer answerid,String username);
	
	
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
	public PageResult findPage(Upstart upstart, int pageNum,int pageSize);
	
}
