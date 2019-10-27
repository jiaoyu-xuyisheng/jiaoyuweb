package com.jiaoyu.teacher.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.UpstartMapper;
import com.jiaoyu.pojo.Upstart;
import com.jiaoyu.pojo.UpstartExample;
import com.jiaoyu.pojo.UpstartExample.Criteria;
import com.jiaoyu.teacher.service.UpstartService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class UpstartServiceImpl implements UpstartService {

	@Autowired
	private UpstartMapper upstartMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Upstart> findAll() {
		return upstartMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Upstart> page=   (Page<Upstart>) upstartMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Upstart upstart) {
		upstartMapper.insert(upstart);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Upstart upstart){
		upstartMapper.updateByPrimaryKey(upstart);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Upstart findOne(Integer id){
		return upstartMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			upstartMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Upstart upstart, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		UpstartExample example=new UpstartExample();
		Criteria criteria = example.createCriteria();
		
		if(upstart!=null){			
						if(upstart.getUsename()!=null && upstart.getUsename().length()>0){
				criteria.andUsenameLike("%"+upstart.getUsename()+"%");
			}
			if(upstart.getAnswername()!=null && upstart.getAnswername().length()>0){
				criteria.andAnswernameLike("%"+upstart.getAnswername()+"%");
			}
	
		}
		
		Page<Upstart> page= (Page<Upstart>)upstartMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public Upstart findOneByUsernameAndAnswerId(Integer answerid,String username) {
			UpstartExample example=new UpstartExample();
			Criteria criteria = example.createCriteria();
			criteria.andAnsweridEqualTo(answerid);
			criteria.andUsenameEqualTo(username);
			 List<Upstart> list = upstartMapper.selectByExample(example);
			 if(list==null||list.size()==0) {
				 return null;
			 }else {
				 return list.get(0); 
			 }
			
		}
	
}
