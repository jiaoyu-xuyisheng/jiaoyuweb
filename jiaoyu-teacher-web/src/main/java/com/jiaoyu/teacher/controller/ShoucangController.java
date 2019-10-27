package com.jiaoyu.teacher.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Shoucang;
import com.jiaoyu.teacher.service.ShoucangService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shoucang")
public class ShoucangController {

	@Reference
	private ShoucangService shoucangService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Shoucang> findAll(){			
		return shoucangService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return shoucangService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param shoucang
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Shoucang shoucang){
		try {
			shoucangService.add(shoucang);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param shoucang
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Shoucang shoucang){
		try {
			shoucangService.update(shoucang);
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
	public Shoucang findOne(Integer id){
		return shoucangService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			shoucangService.delete(ids);
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
	public PageResult search(@RequestBody Shoucang shoucang, int page, int rows  ){
		return shoucangService.findPage(shoucang, page, rows);		
	}
	
}
