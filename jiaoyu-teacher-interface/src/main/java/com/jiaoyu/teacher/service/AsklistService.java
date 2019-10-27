package com.jiaoyu.teacher.service;
import java.util.List;
import java.util.Map;

import com.jiaoyu.pojo.Asklist;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface AsklistService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Asklist> findAll();
	
	
	public Map<String,Object>  findAskListByKeId(Integer keid,Integer pageNum,Integer pageSize);
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Asklist asklist);
	
	
	/**
	 * 修改
	 */
	public void update(Asklist asklist);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Asklist findOne(Integer id);
	
	
	
	/**
	 * 根据用户名字找问题对象！！
	 * @param id
	 * @return
	 */
	public List<Map<String,Object>>  findAskByUsername(String username);
	
	
	
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
	public PageResult findPage(Asklist asklist, int pageNum,int pageSize);
	
}
