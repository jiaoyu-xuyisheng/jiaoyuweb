package com.jiaoyu.teacher.controller;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.aliyuncs.exceptions.ClientException;
import com.jiaoyu.pojo.Jyuser;
import com.jiaoyu.teacher.service.JyuserService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/jyuser")
public class JyuserController {

	@Reference
	private JyuserService jyuserService;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Autowired
	private SmsUtil smsUtil;
	
	@Autowired
	private MD5PasswordEncoder mD5PasswordEncoder;
	
	
	/**
	 * 发送验证码！！
	 * @param jyuser
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/sendsms")
	public Result sendsms(String phone){
		try {
			Random random=new Random();
			String num=random.nextInt(999999)+"";
			System.out.println(num);
			redisTemplate.boundHashOps(phone).put("code", num);
			System.out.println(phone);
			Map<String,String> map=new HashMap<String,String>();
			
			map.put("mobile", phone);
			map.put("template_code", "SMS_147975686");
			map.put("sign_name", "521jiaoyu");		
			map.put("param", "{\"code\":"+num+"}");			
			System.out.println(map);
			smsUtil.sendSms(map);
			return new Result(true,"验证码发送成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"验证码发送失败");
		}
	
	}
		
	

	/**
	 * 增加
	 * @param jyuser
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Jyuser jyuser,String code){
		try {
			String rediscode = (String) redisTemplate.boundHashOps(jyuser.getJyPhone()).get("code");
			if(code==null||code.equals("")) {
				return new Result(false,"验证码为空");
			}else if(rediscode==null) {
				return new Result(false,"没有发送验证码");
			}
			else if(!code.equals(rediscode)) {
				return new Result(false,"验证码错误");
			}
			
			jyuser.setJyCreatedate(new Date());
			jyuser.setJyUpdate(new Date());
			jyuser.setRole(1);
			
			
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String password = passwordEncoder.encode(jyuser.getJyPassword());
			
						
			System.out.println(password);			
			jyuser.setJyPassword(password);
			jyuserService.add(jyuser);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Jyuser> findAll(){			
		return jyuserService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return jyuserService.findPage(page, rows);
	}
	
	/**
	 * 修改
	 * @param jyuser
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Jyuser jyuser){
		try {
			jyuserService.update(jyuser);
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
	public Jyuser findOne(String username){
		
			Jyuser one=	jyuserService.findOne(username);
			return one;
				
				
		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(String [] ids){
		try {
			jyuserService.delete(ids);
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
	public PageResult search(@RequestBody Jyuser jyuser, int page, int rows  ){
		return jyuserService.findPage(jyuser, page, rows);		
	}
	
	
	   public static String getMapToString(Map<String,Object> map){
	       Set<String> keySet = map.keySet();
	       //将set集合转换为数组
	       String[] keyArray = keySet.toArray(new String[keySet.size()]);
	       //给数组排序(升序)
	       Arrays.sort(keyArray);
	       //因为String拼接效率会很低的，所以转用StringBuilder
	       StringBuilder sb = new StringBuilder();
	       for (int i = 0; i < keyArray.length; i++) {
	           // 参数值为空，则不参与签名 这个方法trim()是去空格
	           if ((String.valueOf(map.get(keyArray[i]))).trim().length() > 0) {
	               sb.append(keyArray[i]).append(":").append(String.valueOf(map.get(keyArray[i])).trim());
	           }
	           if(i != keyArray.length-1){
	               sb.append(",");
	           }
	       }
	       return sb.toString();
	   }
	
}
