package com.jiaoyu.teacher.service;
import java.util.List;
import java.util.Map;

import com.jiaoyu.pojo.Ke;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface KeService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Ke> findAll();
	
	
	/**
	 * 通过用户名得到用户发布的课程列表！！
	 * @return
	 */
	public List<Ke> findKeListByUsername(String publicshid);
	
	/**
	 * 通过keid找到分类名字
	 * @param keid
	 * @return
	 */
	public String findCfname(Integer keid);
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Ke ke);
	
	
	/**
	 * 修改
	 */
	public void update(Ke ke);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Ke findOne(Integer id);
	
	
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
	public PageResult findPage(Ke ke, int pageNum,int pageSize);


	public List<Ke> findByFirstId(Integer firstid);


	public List<Ke> findPoupleList();
	
	public List<Ke> findNewKeList();	
	
}
