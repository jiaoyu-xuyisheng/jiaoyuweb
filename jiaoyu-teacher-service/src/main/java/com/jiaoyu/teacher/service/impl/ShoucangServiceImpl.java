package com.jiaoyu.teacher.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.ShoucangMapper;
import com.jiaoyu.pojo.Shoucang;
import com.jiaoyu.pojo.ShoucangExample;
import com.jiaoyu.pojo.ShoucangExample.Criteria;
import com.jiaoyu.teacher.service.ShoucangService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ShoucangServiceImpl implements ShoucangService {

	@Autowired
	private ShoucangMapper shoucangMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Shoucang> findAll() {
		return shoucangMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Shoucang> page=   (Page<Shoucang>) shoucangMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Shoucang shoucang) {
		shoucangMapper.insert(shoucang);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Shoucang shoucang){
		shoucangMapper.updateByPrimaryKey(shoucang);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Shoucang findOne(Integer id){
		return shoucangMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			shoucangMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Shoucang shoucang, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ShoucangExample example=new ShoucangExample();
		Criteria criteria = example.createCriteria();
		
		if(shoucang!=null){			
						if(shoucang.getUsername()!=null && shoucang.getUsername().length()>0){
				criteria.andUsernameLike("%"+shoucang.getUsername()+"%");
			}
			if(shoucang.getKeurl()!=null && shoucang.getKeurl().length()>0){
				criteria.andKeurlLike("%"+shoucang.getKeurl()+"%");
			}
			if(shoucang.getKeimgurl()!=null && shoucang.getKeimgurl().length()>0){
				criteria.andKeimgurlLike("%"+shoucang.getKeimgurl()+"%");
			}
	
		}
		
		Page<Shoucang> page= (Page<Shoucang>)shoucangMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public List<Shoucang> findShoucangList(String username) {
			ShoucangExample example=new ShoucangExample();	
			Criteria criteria = example.createCriteria();		
			criteria.andUsernameEqualTo(username);
			return shoucangMapper.selectByExample(example);
		}
	
}
