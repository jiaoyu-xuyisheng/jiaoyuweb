package com.jiaoyu.teacher.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.JyuserMapper;
import com.jiaoyu.pojo.Jyuser;
import com.jiaoyu.pojo.JyuserExample;
import com.jiaoyu.pojo.JyuserExample.Criteria;
import com.jiaoyu.teacher.service.JyuserService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class JyuserServiceImpl implements JyuserService {

	@Autowired
	private JyuserMapper jyuserMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Jyuser> findAll() {
		return jyuserMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Jyuser> page=   (Page<Jyuser>) jyuserMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Jyuser jyuser) {
		jyuserMapper.insert(jyuser);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Jyuser jyuser){
		jyuserMapper.updateByPrimaryKey(jyuser);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Jyuser findOne(String username){
		return jyuserMapper.selectByPrimaryKey(username);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] usernames) {
		for(String username:usernames){
			jyuserMapper.deleteByPrimaryKey(username);
		}		
	}
	
	
		@Override
	public PageResult findPage(Jyuser jyuser, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		JyuserExample example=new JyuserExample();
		Criteria criteria = example.createCriteria();
		
		if(jyuser!=null){			
						if(jyuser.getJyUsername()!=null && jyuser.getJyUsername().length()>0){
				criteria.andJyUsernameLike("%"+jyuser.getJyUsername()+"%");
			}
			if(jyuser.getJyPassword()!=null && jyuser.getJyPassword().length()>0){
				criteria.andJyPasswordLike("%"+jyuser.getJyPassword()+"%");
			}
			if(jyuser.getJyPhone()!=null && jyuser.getJyPhone().length()>0){
				criteria.andJyPhoneLike("%"+jyuser.getJyPhone()+"%");
			}
			if(jyuser.getJyHeadpic()!=null && jyuser.getJyHeadpic().length()>0){
				criteria.andJyHeadpicLike("%"+jyuser.getJyHeadpic()+"%");
			}
			if(jyuser.getJyAnswer1()!=null && jyuser.getJyAnswer1().length()>0){
				criteria.andJyAnswer1Like("%"+jyuser.getJyAnswer1()+"%");
			}
			if(jyuser.getJyAnswer2()!=null && jyuser.getJyAnswer2().length()>0){
				criteria.andJyAnswer2Like("%"+jyuser.getJyAnswer2()+"%");
			}
			if(jyuser.getJyAnswer3()!=null && jyuser.getJyAnswer3().length()>0){
				criteria.andJyAnswer3Like("%"+jyuser.getJyAnswer3()+"%");
			}
			if(jyuser.getJyAsk1()!=null && jyuser.getJyAsk1().length()>0){
				criteria.andJyAsk1Like("%"+jyuser.getJyAsk1()+"%");
			}
			if(jyuser.getJyAsk2()!=null && jyuser.getJyAsk2().length()>0){
				criteria.andJyAsk2Like("%"+jyuser.getJyAsk2()+"%");
			}
			if(jyuser.getJyAsk3()!=null && jyuser.getJyAsk3().length()>0){
				criteria.andJyAsk3Like("%"+jyuser.getJyAsk3()+"%");
			}
			if(jyuser.getJyEmall()!=null && jyuser.getJyEmall().length()>0){
				criteria.andJyEmallLike("%"+jyuser.getJyEmall()+"%");
			}
			if(jyuser.getCompany()!=null && jyuser.getCompany().length()>0){
				criteria.andCompanyLike("%"+jyuser.getCompany()+"%");
			}
	
		}
		
		Page<Jyuser> page= (Page<Jyuser>)jyuserMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
