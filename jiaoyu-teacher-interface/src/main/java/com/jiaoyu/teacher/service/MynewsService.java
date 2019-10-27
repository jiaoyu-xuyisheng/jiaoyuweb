package com.jiaoyu.teacher.service;
import java.util.List;
import com.jiaoyu.pojo.Mynews;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface MynewsService {
	
	
	/**
	 * 按时间排序！！最新的新闻
	 * @return
	 */
	public List<Mynews> findNewNewsList();

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Mynews> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Mynews mynews);
	
	
	/**
	 * 修改
	 */
	public void update(Mynews mynews);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Mynews findOne(Long id);
	
	
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
	public PageResult findPage(Mynews mynews, int pageNum,int pageSize);
	
}
