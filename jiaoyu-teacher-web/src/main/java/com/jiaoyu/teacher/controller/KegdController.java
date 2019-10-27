package com.jiaoyu.teacher.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Kegd;
import com.jiaoyu.teacher.service.KegdService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/kegd")
public class KegdController {

	@Reference
	private KegdService kegdService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Kegd> findAll(){			
		return kegdService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return kegdService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param kegd
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Kegd kegd){
		try {
			kegdService.add(kegd);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param kegd
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Kegd kegd){
		try {
			kegdService.update(kegd);
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
	public Kegd findOne(Long id){
		return kegdService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			kegdService.delete(ids);
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
	public PageResult search(@RequestBody Kegd kegd, int page, int rows  ){
		return kegdService.findPage(kegd, page, rows);		
	}
	
}
