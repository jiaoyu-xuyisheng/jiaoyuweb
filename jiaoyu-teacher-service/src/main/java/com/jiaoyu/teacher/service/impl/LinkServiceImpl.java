package com.jiaoyu.teacher.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.FriendlyLinkMapper;
import com.jiaoyu.pojo.FriendlyLink;
import com.jiaoyu.pojo.FriendlyLinkExample;
import com.jiaoyu.pojo.FriendlyLinkExample.Criteria;
import com.jiaoyu.teacher.service.LinkService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout=10000)
public class LinkServiceImpl implements LinkService {

	@Autowired
	private FriendlyLinkMapper linkMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<FriendlyLink> findAll() {
		return linkMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<FriendlyLink> page=   (Page<FriendlyLink>) linkMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(FriendlyLink link) {
		linkMapper.insert(link);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(FriendlyLink link){
		linkMapper.updateByPrimaryKey(link);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public FriendlyLink findOne(Long id){
		return linkMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			linkMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(FriendlyLink link, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		FriendlyLinkExample example=new FriendlyLinkExample();
		Criteria criteria = example.createCriteria();
		
		if(link!=null){			
						if(link.getFname()!=null && link.getFname().length()>0){
				criteria.andFnameLike("%"+link.getFname()+"%");
			}
			if(link.getFurl()!=null && link.getFurl().length()>0){
				criteria.andFurlLike("%"+link.getFurl()+"%");
			}
	
		}
		
		Page<FriendlyLink> page= (Page<FriendlyLink>)linkMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
