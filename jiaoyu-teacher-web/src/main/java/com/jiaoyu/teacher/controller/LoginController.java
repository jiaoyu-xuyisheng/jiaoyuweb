package com.jiaoyu.teacher.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Answer;
import com.jiaoyu.pojo.Asklist;
import com.jiaoyu.pojo.Jyuser;
import com.jiaoyu.pojo.Ke;
import com.jiaoyu.pojo.Kecomment;
import com.jiaoyu.pojo.Lowstart;
import com.jiaoyu.pojo.Shoucang;
import com.jiaoyu.pojo.Upstart;
import com.jiaoyu.teacher.service.AnswerService;
import com.jiaoyu.teacher.service.AsklistService;
import com.jiaoyu.teacher.service.JyuserService;
import com.jiaoyu.teacher.service.KeService;
import com.jiaoyu.teacher.service.KecommentService;
import com.jiaoyu.teacher.service.LowstartService;
import com.jiaoyu.teacher.service.ShoucangService;
import com.jiaoyu.teacher.service.UpstartService;

import entity.Result;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	
	@Reference
	private JyuserService jyuserService;
	
	@Reference
	private AsklistService asklistService;
	

	@Reference
	private AnswerService answerService;
	
	@Reference
	private KeService keService;
	

	@Reference
	private ShoucangService shoucangService;
	
	@Reference
	private KecommentService kecommentService;
		
	@Reference
	private UpstartService upstartService;
	

	@Reference
	private LowstartService lowstartService;
	
		
	@RequestMapping("/name")
	public Map<String,String> name() {
		String name=SecurityContextHolder.getContext().getAuthentication().getName();
		Map<String,String> map=new HashMap<String,String>();		
		map.put("loginName", name);	
		return map;	
	}
	
	@RequestMapping("/findUser")
	public Jyuser findUser() {
		Map<String,String> name = name();
		Jyuser jyuser = jyuserService.findOne(name.get("loginName"));
		return jyuser;		
	}
	
	
	
	@RequestMapping("/findAskByUsername")
	public List<Map<String,Object>>  findAskByUsername(){
		Map<String, String> name = name();
	
		List<Map<String, Object>> map= asklistService.findAskByUsername(name.get("loginName"));
		
		return map;
	}
	
	
	@RequestMapping("/findAnswerByUsername")
	public List<Map<String, Object>> findAnswerByUsername() {
		String username = name().get("loginName");
		
		List<Map<String, Object>> list = answerService.findAnswerByUsername(username);
		return list;
	}
	
	
	
	@RequestMapping("/findKeList")
	public List<Ke> findKeListByUsername(){
		String username = name().get("loginName");
		List<Ke> list = keService.findKeListByUsername(username);
		return list;
	}
	
	
	@RequestMapping("/findShoucangList")
	public List<Shoucang> findShoucangList(){
		String username = name().get("loginName");
		return  shoucangService.findShoucangList(username);
	}
	
	
	@RequestMapping("/add")
	public Result add(Integer keId,String askTitle,String askContainer){
		try {
			Asklist asklist=new Asklist();
			String username = name().get("loginName");
			if(username==null||username.equals("")) {
				return new Result(false, "增加失败请先登录");
			}
			System.out.println(username);
			Date date=new Date();
			asklist.setAskDatetime(date);
			asklist.setUserId(1);		
			asklist.setUsername(username);
			asklist.setView(1);
			//0表示未解决呀！！1表示解决呀！！
			asklist.setStatus(0);				
			asklist.setKeId(keId);
			asklist.setAskTitle(askTitle);
			asklist.setAskContainer(askContainer);		
			asklist.setAskurl("http://localhost:8092/Question_answer.html?askid=");
			asklistService.add(asklist);		
			return new Result(true, "提问成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "提问失败");
		}
	}
	
	
	@RequestMapping("/addpj")
	public Result addpj(Integer keId,String comcontent,String start) {
		
		try {
			String username = name().get("loginName");
			if(username==null||username.equals("")) {
				return new Result(false, "评价失败请先登录");
			}
			Date date=new Date();
			Kecomment kecom=new Kecomment();
			kecom.setUsername(username);
			kecom.setCommentdate(date);
			kecom.setKeid(keId);
			kecom.setComcontent(comcontent);
			kecom.setStart(start);
			String headpic = findUser().getJyHeadpic();
			if(headpic==null||headpic.equals("")) {
				kecom.setUserimgurl("http://localhost:8092/img/g.gif");				
			}else {
				kecom.setUserimgurl(headpic);
			}
			kecommentService.add(kecom);			
			return new Result(true, "评价成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "评价失败");
		}
		
		
	
	}

	
	/**
	 * 添加答案
	 * @param askid
	 * @param container
	 * @return
	 */
	@RequestMapping("/addAnswer")
	public Result addAnswer(Integer askid,String container) {
		try {
			Answer answer=new Answer();
			Date date=new Date();
			String username = name().get("loginName");
			if(username==null||username.equals("")) {
				return new Result(false, "回答！请先登录");
			}
			
			answer.setUserId(1);
			answer.setUsername(username);
			answer.setAuswerdate(date);
			String header = jyuserService.findOne(username).getJyPassword();
			if(header==null||header.equals("")) {
				answer.setJyHeadpic(header);
			}
			answer.setJyHeadpic("https://pic.cnblogs.com/face/730267/20160802173206.png");
			answer.setUpstart(0);
			answer.setLowstart(0);
			answer.setAdopt(0);
			answer.setContainer(container);
			answer.setAskid(askid);
			answerService.add(answer);
			return new Result(true,"回答成功！！");
		} catch (Exception e) {
			 e.printStackTrace();
			return new Result(false,"回答失败！！");
		}
	}

	
	/**
	 * 点赞方法
	 * @param answerid
	 * @return
	 */
	@RequestMapping("/addUpStart")
	public Result addUpStart(Integer answerid) {
		String username = name().get("loginName");
		System.out.println(username);
		if(username==null||username.equals("")) {
			return new Result(false, "请先登录，然后点赞哦！！");
		}
		Answer answer = answerService.findOne(answerid);
		Integer upNum = answer.getUpstart();
		Upstart upstart = upstartService.findOneByUsernameAndAnswerId(answerid, username);
		Lowstart lowstart = lowstartService.findByAnswerIdAndUserName(answerid, username);
		if(lowstart!=null) {
			return new Result(false,"你点了low就不能点赞了！！");
		}
		if(upstart==null) {
		
			upNum=upNum+1;
			Upstart up2=new Upstart();
			up2.setAnswerid(answerid);
			up2.setAnswername(answer.getUsername());
			Date date=new Date();
			up2.setUppdate(date);
			System.out.println(username+"up2");
			up2.setUsename(username);
			upstartService.add(up2);
			answer.setUpstart(upNum);
			answerService.update(answer);
			return new Result(true,"点赞成功呀");
			
		}else {
			return new Result(false,"你点过赞了不用点了！！");
		}
	
		
	}

	
	/**
	 * 点low方法
	 * @param answerid
	 * @return
	 */
	@RequestMapping("/addLow")
	public Result addLow(Integer answerid) {
		String lowusername = name().get("loginName");
		if(lowusername==null||lowusername.equals("")) {
			return new Result(false, "请先登录，然后点赞哦！！");
		}
		Answer answer = answerService.findOne(answerid);
		System.out.println("accross the addlow");
		Integer low = answer.getLowstart();
		Lowstart lowstart = lowstartService.findByAnswerIdAndUserName(answerid, lowusername);
		Upstart upstart = upstartService.findOneByUsernameAndAnswerId(answerid, lowusername);
		if(upstart!=null) {
			return new Result(false,"你已经点赞了哦！不能点low了！！");
		}
		if(lowstart==null) {
			low=low+1;
			Lowstart low2=new Lowstart();
			low2.setAnswerid(answerid);
			low2.setLowusername(lowusername);
			low2.setAnusername(answer.getUsername());
			low2.setLowcreatedate(new Date());			
			answer.setLowstart(low);
			answerService.update(answer);
			lowstartService.add(low2);
			return new Result(true,"点low成功");
		}else {
			return new Result(false,"你已经点过low了，不能点了！");
		}
	
	}




}
