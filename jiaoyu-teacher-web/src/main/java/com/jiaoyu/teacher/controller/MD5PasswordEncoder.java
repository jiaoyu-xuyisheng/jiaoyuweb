package com.jiaoyu.teacher.controller;

import java.util.Random;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class MD5PasswordEncoder implements PasswordEncoder {

	/**
	 * 重写加密码算法
	 */
	@Override
	public String encode(CharSequence rawPassword) {
		String str="abcdefghijklmnopqrstuvwxyz01234567890ABCDEFGHIJKLMN";
		StringBuilder sb=new StringBuilder(16);
		//产生一个16位的随机数
		int len=str.length();
		Random random=new Random();
		for (int i=0;i<16;i++) {			
			int number = random.nextInt(len);
			sb.append(str.charAt(number));
			
		}
		String Salt=sb.toString();
		rawPassword=DigestUtils.md5Hex(rawPassword+Salt);
		
		char []cs=new char[48];
		
		for(int i=0;i<48;i+=3) {
			//加密后的第0,2,4,6,8,..30 是cs的0,3,6
			cs[i]=rawPassword.charAt(i/3*2);
			//Salt的每一个字 是cs的第1,4,7
			cs[i+1]=Salt.charAt(i/3);
			//加密后的第 1,3,5,7,..31 是cs的2,5,8
			cs[i+2]=rawPassword.charAt(i/3*2+1);			
		}		
		return String.valueOf(cs);
	}

	
	/**
	 * 配对加密算法
	 */
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {		
		char[] ch2=new char[16];
		for(int i=0;i<48;i+=3) {		
			ch2[i/3]=encodedPassword.charAt(i+1);			
		}
		
		String Salt=new String(ch2);
		return DigestUtils.md5Hex(rawPassword+Salt).equals(encodedPassword);
	}

}
