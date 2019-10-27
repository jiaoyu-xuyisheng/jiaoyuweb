package com.jiaoyu.teacher.service;
import java.util.List;
import java.util.Map;

import com.jiaoyu.pojo.Answer;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface AnswerService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Answer> findAll();
	
	
	public Integer findAskCount(Integer askid);
	
	
	
	public List<Map<String,Object>>  findAnswerByUsername(String username);
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Answer answer);
	
	
	/**
	 * 修改
	 */
	public void update(Answer answer);
	

	/**
	 * 根据ID获取实体
	 * @param answerid
	 * @return
	 */
	public Answer findOne(Integer answerid);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Answer answer, int pageNum,int pageSize);


	public PageResult findAnswerListByAskId(Integer askid, int pageNum, int pageSize);
	
}
