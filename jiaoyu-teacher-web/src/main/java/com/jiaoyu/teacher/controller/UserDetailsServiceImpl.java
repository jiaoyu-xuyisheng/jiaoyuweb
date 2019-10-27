package com.jiaoyu.teacher.controller;

import java.util.ArrayList;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Jyuser;
import com.jiaoyu.teacher.service.JyuserService;
import com.jiaoyu.teacher.service.UserService;


/**
 * 认证类
 * @author xuyisheng
 *
 */
@RestController
public class UserDetailsServiceImpl implements UserDetailsService {	
	//set 方法注入对象
	

	private JyuserService jyuserService;
	
			
	public void setJyuserService(JyuserService jyuserService) {
		this.jyuserService = jyuserService;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws
	UsernameNotFoundException {		
		System.out.println("accrose the UserDetails");		
    ArrayList<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>(); 
    grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));    
    String password = jyuserService.findOne(username).getJyPassword();
    return new User(username,password,grantedAuths);
	}
	
	
	

}
