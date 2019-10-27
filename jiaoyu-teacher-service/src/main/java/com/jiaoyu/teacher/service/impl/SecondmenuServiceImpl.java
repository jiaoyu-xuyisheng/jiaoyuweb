package com.jiaoyu.teacher.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.SecondmenuMapper;
import com.jiaoyu.pojo.Secondmenu;
import com.jiaoyu.pojo.SecondmenuExample;
import com.jiaoyu.pojo.SecondmenuExample.Criteria;
import com.jiaoyu.teacher.service.SecondmenuService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout=10000)
public class SecondmenuServiceImpl implements SecondmenuService {

	@Autowired
	private SecondmenuMapper secondmenuMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Secondmenu> findAll() {
		return secondmenuMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Secondmenu> page=   (Page<Secondmenu>) secondmenuMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Secondmenu secondmenu) {
		secondmenuMapper.insert(secondmenu);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Secondmenu secondmenu){
		secondmenuMapper.updateByPrimaryKey(secondmenu);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Secondmenu findOne(Long id){
		return secondmenuMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			secondmenuMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Secondmenu secondmenu, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		SecondmenuExample example=new SecondmenuExample();
		Criteria criteria = example.createCriteria();
		
		if(secondmenu!=null){			
						if(secondmenu.getSmName()!=null && secondmenu.getSmName().length()>0){
				criteria.andSmNameLike("%"+secondmenu.getSmName()+"%");
			}
			if(secondmenu.getSmUrl()!=null && secondmenu.getSmUrl().length()>0){
				criteria.andSmUrlLike("%"+secondmenu.getSmUrl()+"%");
			}
	
		}
		
		Page<Secondmenu> page= (Page<Secondmenu>)secondmenuMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		
		
		/**
		 * 通过父id找到子集合
		 */
		@Override
		public List<Secondmenu> findByParentId(Integer id) {	
			SecondmenuExample example=new SecondmenuExample();
			Criteria criteria = example.createCriteria();
			criteria.andSmFatherIdEqualTo(id);	
			return secondmenuMapper.selectByExample(example);
		}
	
}
