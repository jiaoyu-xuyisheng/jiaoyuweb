package com.jiaoyu.teacher.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Asklist;
import com.jiaoyu.pojo.Jyuser;
import com.jiaoyu.pojo.Ke;
import com.jiaoyu.pojo.Kecomment;
import com.jiaoyu.pojo.Kelist;
import com.jiaoyu.teacher.service.AsklistService;
import com.jiaoyu.teacher.service.JyuserService;
import com.jiaoyu.teacher.service.KeService;
import com.jiaoyu.teacher.service.KecommentService;
import com.jiaoyu.teacher.service.KelistService;
import com.jiaoyu.teacher.service.SearchService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/ke")
public class KeController {

	@Reference
	private KeService keService;
	
	
	@Reference
	private KelistService kelistService;
	
	

	@Reference
	private JyuserService jyuserService;
	
	
	@Reference
	private KecommentService kecommentService;
	
	
	@Reference
	private AsklistService asklistService;
	
	
	@Reference
	private SearchService searchService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findKe")
	public Map<String,Object> findKe(Integer keid){	
		Map<String,Object> kemap=new HashMap<String,Object>();
		Ke ke = findOne(keid);
		List<Kelist> keList = kelistService.findKeByKeId(keid);
		String keurl = keList.get(0).getListUrl1();			
		kemap.put("ketitle", ke.getTitle());
		kemap.put("charge", ke.getCharge());
		kemap.put("view", ke.getPageView());
		kemap.put("keurl", keurl);
		kemap.put("keList",keList);
		kemap.put("detail", ke.getDetails());
		return kemap;
	}
	
	
	
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Ke> findAll(){			
		return keService.findAll();
	}
		
	
	@RequestMapping("/searchke")
	public Map<String, Object> searchke(@RequestBody Map<String,Object> searchMap) {
		return searchService.searchke(searchMap);
	}
	/**
	 * 选项卡
	 * @param firstid
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/findByFirstId")
	public List<Map> findByFirstId(Integer firstid){
		List<Map> listmap=new ArrayList<Map>();
		
		 List<Ke> list = keService.findByFirstId(firstid);
		 for (Ke ke : list) {
			Map<Object, Object> map=new HashMap<>();
			map.put("company", ke.getCompany());
			map.put("imgurl",ke.getImgurl());
			map.put("keurl",ke.getKeurl()+ke.getId());			
			map.put("title",ke.getTitle());
			map.put("charge",ke.getCharge());
			map.put("publisherId",ke.getPublisherId());
			 listmap.add(map);
		}
		
		 return listmap;
		
	}
	
	/**
	 * 最受欢迎的课！！
	 */
	@RequestMapping("/findPoupleList")
	public List<Map>  findPoupleList(){
		List<Map> listmap=new ArrayList<Map>();
		List<Ke> pist = keService.findPoupleList();
		for (Ke ke : pist) {
			Map<Object, Object> map=new HashMap<>();
			map.put("company", ke.getCompany());
			map.put("imgurl",ke.getImgurl());
			map.put("keurl",ke.getKeurl());	
			map.put("title",ke.getTitle());
			map.put("charge",ke.getCharge());
			map.put("publisherId",ke.getPublisherId());
			 listmap.add(map);
		}
		 return listmap;
	}
	
	
	/**
	 * 最新的课！！
	 */
	@RequestMapping("/findNewKeList")
	public List<Map>  findNewKeList(){
		List<Map> listmap=new ArrayList<Map>();
		List<Ke> pist = keService.findNewKeList();
		for (Ke ke : pist) {
			Map<Object, Object> map=new HashMap<>();
			map.put("company", ke.getCompany());
			map.put("imgurl",ke.getImgurl());
			map.put("keurl",ke.getKeurl());	
			map.put("title",ke.getTitle());
			map.put("charge",ke.getCharge());
			map.put("publisherId",ke.getPublisherId());
			 listmap.add(map);
		}
		 return listmap;
	}
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return keService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param ke
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Ke ke){
		try {
			keService.add(ke);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param ke
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Ke ke){
		try {
			keService.update(ke);
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
	public Ke findOne(Integer id){
		return keService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			keService.delete(ids);
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
	public PageResult search(@RequestBody Ke ke, int page, int rows  ){
		return keService.findPage(ke, page, rows);		
	}
	
}
