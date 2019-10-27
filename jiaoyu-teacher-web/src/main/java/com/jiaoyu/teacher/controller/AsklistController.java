package com.jiaoyu.teacher.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.hamcrest.core.IsNot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Asklist;
import com.jiaoyu.pojo.Jyuser;
import com.jiaoyu.teacher.service.AnswerService;
import com.jiaoyu.teacher.service.AsklistService;
import com.jiaoyu.teacher.service.JyuserService;
import com.jiaoyu.teacher.service.KeService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/asklist")
public class AsklistController {
	
	
	public static Integer i=200;

	@Reference
	private AsklistService asklistService;
	
	@Reference
	private KeService keService;
		

	@Reference
	private AnswerService answerService;
	
	@Reference
	private JyuserService jyuserService;
	
	@Autowired 
	private HttpServletRequest request;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Asklist> findAll(){			
		return asklistService.findAll();
	}
	
	
	
	@RequestMapping("/findAskListByKeId")
	public Map<String,Object>  findAskListByKeId(Integer keid,Integer pageNum,Integer pageSize) {
		return asklistService.findAskListByKeId(keid, pageNum, pageSize);
		
	}
		
	
	
	@RequestMapping("/findAnswerPage")
	public Map<String,Object> findAnswerPage(Integer askid){
		i++;
		 Asklist one = asklistService.findOne(askid);		
		Integer count = answerService.findAskCount(askid);
		Jyuser jyuser = jyuserService.findOne(one.getUsername());
		String headpic = jyuser.getJyHeadpic();				
		String cfname = keService.findCfname(one.getKeId());
		 Map<String,Object> map=new HashMap<String,Object>();
		 map.put("asktitle",one.getAskTitle());
		 map.put("viewCount", i);
		 map.put("answercount", count);
		 map.put("username", one.getUsername());
		 map.put("askDate", one.getAskDatetime());
		 map.put("askContent",one.getAskContainer());
		 map.put("cfname", cfname);
		 map.put("headpic", headpic);		 
		 return map;
	}
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return asklistService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param asklist
	 * @return
	 */

	
	/**
	 * 修改
	 * @param asklist
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Asklist asklist){
		try {
			asklistService.update(asklist);
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
	public Asklist findOne(Integer id){
		return asklistService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			asklistService.delete(ids);
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
	public PageResult search(@RequestBody Asklist asklist, int page, int rows  ){
		return asklistService.findPage(asklist, page, rows);		
	}
	
}
