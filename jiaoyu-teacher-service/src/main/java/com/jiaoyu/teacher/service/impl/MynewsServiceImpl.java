package com.jiaoyu.teacher.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.MynewsMapper;
import com.jiaoyu.pojo.Mynews;
import com.jiaoyu.pojo.MynewsExample;
import com.jiaoyu.pojo.MynewsExample.Criteria;
import com.jiaoyu.teacher.service.MynewsService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout=10000)
public class MynewsServiceImpl implements MynewsService {

	@Autowired
	private MynewsMapper mynewsMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Mynews> findAll() {
		return mynewsMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Mynews> page=   (Page<Mynews>) mynewsMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Mynews mynews) {
		mynewsMapper.insert(mynews);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Mynews mynews){
		mynewsMapper.updateByPrimaryKey(mynews);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Mynews findOne(Long id){
		return mynewsMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			mynewsMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Mynews mynews, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		MynewsExample example=new MynewsExample();
		Criteria criteria = example.createCriteria();
		
		if(mynews!=null){			
						if(mynews.getNewcontainer()!=null && mynews.getNewcontainer().length()>0){
				criteria.andNewcontainerLike("%"+mynews.getNewcontainer()+"%");
			}
			if(mynews.getNewstitle()!=null && mynews.getNewstitle().length()>0){
				criteria.andNewstitleLike("%"+mynews.getNewstitle()+"%");
			}
	
		}
		
		Page<Mynews> page= (Page<Mynews>)mynewsMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		
	/**
	 * 找到最新的新闻！！	
	 */
	@Override
   public List<Mynews> findNewNewsList() {	
			return mynewsMapper.selectByPageNo(0, 6);
	}
	
}
