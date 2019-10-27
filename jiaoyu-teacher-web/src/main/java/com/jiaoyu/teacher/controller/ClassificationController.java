package com.jiaoyu.teacher.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Classification;
import com.jiaoyu.teacher.service.ClassificationService;

import entity.PageResult;
import entity.Result;


/**
 * controller
 * @author Administrator
 *
 */


@RestController
@RequestMapping("/classification")
public class ClassificationController {

	@Reference
	private ClassificationService classificationService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Classification> findAll(){			
		return classificationService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return classificationService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param classification
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Classification classification){
		try {
			classificationService.add(classification);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param classification
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Classification classification){
		try {
			classificationService.update(classification);
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
	public Classification findOne(Long id){
		return classificationService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			classificationService.delete(ids);
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
	public PageResult search(@RequestBody Classification classification, int page, int rows  ){
		return classificationService.findPage(classification, page, rows);		
	}
	
}
