package com.jiaoyu.teacher.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Classification;
import com.jiaoyu.pojo.Secondmenu;
import com.jiaoyu.pojo.SecondmenuExample;
import com.jiaoyu.pojo.SecondmenuExample.Criteria;
import com.jiaoyu.teacher.service.ClassificationService;
import com.jiaoyu.teacher.service.SecondmenuService;

import entity.JyResult;
import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/secondmenu")
public class SecondmenuController {

	@Reference
	private SecondmenuService secondmenuService;
	
	@Reference
	private ClassificationService classificationService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Secondmenu> findAll(){			
		return secondmenuService.findAll();
	}
	
	
	/**
	 * 通过父id找到子集合
	 */
	@RequestMapping("/findMeun")
	public List<JyResult> findMeun() {	
		List<JyResult> mylist=new ArrayList<>();
		List<Classification> list = classificationService.findAll();
		
		for (Classification c : list) {			
			List<Secondmenu> slist = secondmenuService.findByParentId(c.getCfid());
			JyResult result=new JyResult();
				
				result.setFistdate(c.getCfname());
				result.setDate(slist);	
						
			
			mylist.add(result);
		}	
		return mylist;
		
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return secondmenuService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param secondmenu
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Secondmenu secondmenu){
		try {
			secondmenuService.add(secondmenu);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param secondmenu
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Secondmenu secondmenu){
		try {
			secondmenuService.update(secondmenu);
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
	public Secondmenu findOne(Long id){
		return secondmenuService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			secondmenuService.delete(ids);
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
	public PageResult search(@RequestBody Secondmenu secondmenu, int page, int rows  ){
		return secondmenuService.findPage(secondmenu, page, rows);		
	}
	
}
