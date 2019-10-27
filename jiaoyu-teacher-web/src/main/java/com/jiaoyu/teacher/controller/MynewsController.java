package com.jiaoyu.teacher.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Mynews;
import com.jiaoyu.teacher.service.MynewsService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/mynews")
public class MynewsController {

	@Reference
	private MynewsService mynewsService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Mynews> findAll(){			
		return mynewsService.findAll();
	}
	
	
	/**
	 * 找到最新的新闻！！	
	 */
	@RequestMapping("/findNewNewsList")
   public List<Mynews> findNewNewsList(){
	   return mynewsService.findNewNewsList();
   }
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return mynewsService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param mynews
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Mynews mynews){
		try {
			mynewsService.add(mynews);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param mynews
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Mynews mynews){
		try {
			mynewsService.update(mynews);
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
	public Mynews findOne(Long id){
		return mynewsService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			mynewsService.delete(ids);
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
	public PageResult search(@RequestBody Mynews mynews, int page, int rows  ){
		return mynewsService.findPage(mynews, page, rows);		
	}
	
}
