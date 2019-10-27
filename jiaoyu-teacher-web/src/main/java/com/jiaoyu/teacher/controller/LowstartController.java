package com.jiaoyu.teacher.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Lowstart;
import com.jiaoyu.teacher.service.LowstartService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/lowstart")
public class LowstartController {

	@Reference
	private LowstartService lowstartService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Lowstart> findAll(){			
		return lowstartService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return lowstartService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param lowstart
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Lowstart lowstart){
		try {
			lowstartService.add(lowstart);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param lowstart
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Lowstart lowstart){
		try {
			lowstartService.update(lowstart);
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
	public Lowstart findOne(Integer id){
		return lowstartService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			lowstartService.delete(ids);
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
	public PageResult search(@RequestBody Lowstart lowstart, int page, int rows  ){
		return lowstartService.findPage(lowstart, page, rows);		
	}
	
}
