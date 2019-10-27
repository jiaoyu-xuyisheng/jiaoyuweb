package com.jiaoyu.teacher.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.KelistMapper;
import com.jiaoyu.pojo.Kelist;
import com.jiaoyu.pojo.KelistExample;
import com.jiaoyu.pojo.KelistExample.Criteria;
import com.jiaoyu.teacher.service.KelistService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout=10000)
public class KelistServiceImpl implements KelistService {

	@Autowired
	private KelistMapper kelistMapper;
	
	
	
	
	@Override
	public List<Kelist> findKeByKeId(Integer keid){
		
		KelistExample example=new KelistExample();
		Criteria criteria = example.createCriteria();
		criteria.andKeIdEqualTo(keid);
		List<Kelist> list = kelistMapper.selectByExample(example);		
		return list;
	}
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Kelist> findAll() {
		return kelistMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Kelist> page=   (Page<Kelist>) kelistMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Kelist kelist) {
		kelistMapper.insert(kelist);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Kelist kelist){
		kelistMapper.updateByPrimaryKey(kelist);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Kelist findOne(Long id){
		return kelistMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			kelistMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Kelist kelist, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		KelistExample example=new KelistExample();
		Criteria criteria = example.createCriteria();
		
		if(kelist!=null){			
						if(kelist.getListTitle()!=null && kelist.getListTitle().length()>0){
				criteria.andListTitleLike("%"+kelist.getListTitle()+"%");
			}
			if(kelist.getListUrl1()!=null && kelist.getListUrl1().length()>0){
				criteria.andListUrl1Like("%"+kelist.getListUrl1()+"%");
			}
			if(kelist.getListUrl2()!=null && kelist.getListUrl2().length()>0){
				criteria.andListUrl2Like("%"+kelist.getListUrl2()+"%");
			}
	
		}
		
		Page<Kelist> page= (Page<Kelist>)kelistMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
