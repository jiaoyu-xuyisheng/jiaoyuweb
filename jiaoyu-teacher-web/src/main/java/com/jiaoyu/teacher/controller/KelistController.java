package com.jiaoyu.teacher.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Kelist;
import com.jiaoyu.teacher.service.KelistService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/kelist")
public class KelistController {

	@Reference
	private KelistService kelistService;
	
	
	@RequestMapping("/findKeByKeId")
	public List<Kelist> findKeByKeId(Integer keid){
		List<Kelist> list = kelistService.findKeByKeId(keid);
		return list;
	}
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Kelist> findAll(){			
		return kelistService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return kelistService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param kelist
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Kelist kelist){
		try {
			kelistService.add(kelist);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param kelist
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Kelist kelist){
		try {
			kelistService.update(kelist);
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
	public Kelist findOne(Long id){
		return kelistService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			kelistService.delete(ids);
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
	public PageResult search(@RequestBody Kelist kelist, int page, int rows  ){
		return kelistService.findPage(kelist, page, rows);		
	}
	
}
