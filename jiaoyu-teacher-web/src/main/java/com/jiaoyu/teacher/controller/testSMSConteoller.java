package com.jiaoyu.teacher.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aliyuncs.exceptions.ClientException;

@RestController
@RequestMapping("/smsm")
public class testSMSConteoller {
	

	@Autowired
	private SmsUtil smsUtil;
	
	@RequestMapping("/sms")
	public void mySMS() throws ClientException {
		Map<String,String> map=new HashMap<String,String>();
		map.put("mobile", "18107906132");
		map.put("template_code", "SMS_147975686");
		map.put("sign_name", "521jiaoyu");
		map.put("param", "{\"code\":\"102931\"}");
		smsUtil.sendSms(map);
	}

}
