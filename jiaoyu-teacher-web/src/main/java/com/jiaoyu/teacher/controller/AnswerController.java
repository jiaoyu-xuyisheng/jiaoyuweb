package com.jiaoyu.teacher.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Answer;
import com.jiaoyu.teacher.service.AnswerService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/answer")
public class AnswerController {

	@Reference
	private AnswerService answerService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Answer> findAll(){			
		return answerService.findAll();
	}

	
	@RequestMapping("/findAnswerListByAskId")
	public PageResult findAnswerListByAskId(Integer askid, int pageNum, int pageSize){		
		return answerService.findAnswerListByAskId(askid, pageNum, pageSize);
	}
	
	
	@RequestMapping("/findAskCount")
	public Integer findAskCount(Integer askid) {
		return answerService.findAskCount(askid);
	}
	
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return answerService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param answer
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Answer answer){
		try {
			answerService.add(answer);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param answer
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Answer answer){
		try {
			answerService.update(answer);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public Answer findOne(Integer id){
		return answerService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			answerService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody Answer answer, int page, int rows  ){
		return answerService.findPage(answer, page, rows);		
	}
	
}
