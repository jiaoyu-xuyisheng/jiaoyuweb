package com.jiaoyu.teacher.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.KecommentMapper;
import com.jiaoyu.pojo.Kecomment;
import com.jiaoyu.pojo.KecommentExample;
import com.jiaoyu.pojo.KecommentExample.Criteria;
import com.jiaoyu.teacher.service.KecommentService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class KecommentServiceImpl implements KecommentService {

	@Autowired
	private KecommentMapper kecommentMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Kecomment> findAll() {
		return kecommentMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Kecomment> page=   (Page<Kecomment>) kecommentMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Kecomment kecomment) {
		kecommentMapper.insert(kecomment);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Kecomment kecomment){
		kecommentMapper.updateByPrimaryKey(kecomment);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Kecomment findOne(Integer id){
		return kecommentMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			kecommentMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Kecomment kecomment, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		KecommentExample example=new KecommentExample();
		Criteria criteria = example.createCriteria();
		
		if(kecomment!=null){			
						if(kecomment.getUsername()!=null && kecomment.getUsername().length()>0){
				criteria.andUsernameLike("%"+kecomment.getUsername()+"%");
			}
			if(kecomment.getStart()!=null && kecomment.getStart().length()>0){
				criteria.andStartLike("%"+kecomment.getStart()+"%");
			}
			if(kecomment.getUserimgurl()!=null && kecomment.getUserimgurl().length()>0){
				criteria.andUserimgurlLike("%"+kecomment.getUserimgurl()+"%");
			}
			if(kecomment.getComcontent()!=null && kecomment.getComcontent().length()>0){
				criteria.andComcontentLike("%"+kecomment.getComcontent()+"%");
			}
	
		}
		
		Page<Kecomment> page= (Page<Kecomment>)kecommentMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public PageResult findListByKeId(Integer keid, int pageNum, int pageSize) {			
			PageHelper.startPage(pageNum, pageSize);
			KecommentExample example=new KecommentExample();
			Criteria criteria = example.createCriteria();
			criteria.andKeidEqualTo(keid);
			Page<Kecomment> page =(Page<Kecomment>) kecommentMapper.selectByExample(example);
			return new PageResult(page.getTotal(), page.getResult());
		}
	
}




