package com.jiaoyu.teacher.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Kecomment;
import com.jiaoyu.teacher.service.KecommentService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/kecomment")
public class KecommentController {

	@Reference
	private KecommentService kecommentService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Kecomment> findAll(){			
		return kecommentService.findAll();
	}
	
	
	@RequestMapping("/findListByKeId")
	public PageResult findListByKeId(Integer keid, int pageNum, int pageSize) {
		PageResult pageResult = kecommentService.findListByKeId(keid,pageNum,pageSize);
		return pageResult;
	}
	
	
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return kecommentService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param kecomment
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Kecomment kecomment){
		try {
			kecommentService.add(kecomment);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param kecomment
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Kecomment kecomment){
		try {
			kecommentService.update(kecomment);
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
	public Kecomment findOne(Integer id){
		return kecommentService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			kecommentService.delete(ids);
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
	public PageResult search(@RequestBody Kecomment kecomment, int page, int rows  ){
		return kecommentService.findPage(kecomment, page, rows);		
	}
	
}
