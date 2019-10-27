package com.jiaoyu.teacher.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.ClassificationMapper;
import com.jiaoyu.pojo.Classification;
import com.jiaoyu.pojo.ClassificationExample;
import com.jiaoyu.pojo.ClassificationExample.Criteria;
import com.jiaoyu.teacher.service.ClassificationService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout=10000)
public class ClassificationServiceImpl implements ClassificationService {

	@Autowired
	private ClassificationMapper classificationMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Classification> findAll() {
		return classificationMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Classification> page=   (Page<Classification>) classificationMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Classification classification) {
		classificationMapper.insert(classification);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Classification classification){
		classificationMapper.updateByPrimaryKey(classification);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Classification findOne(Long id){
		return classificationMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			classificationMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Classification classification, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		ClassificationExample example=new ClassificationExample();
		Criteria criteria = example.createCriteria();
		
		if(classification!=null){			
						if(classification.getCfname()!=null && classification.getCfname().length()>0){
				criteria.andCfnameLike("%"+classification.getCfname()+"%");
			}
	
		}
		
		Page<Classification> page= (Page<Classification>)classificationMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		

	
}
