package com.jiaoyu.teacher.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.ClassificationMapper;
import com.jiaoyu.mapper.KeMapper;
import com.jiaoyu.pojo.Classification;
import com.jiaoyu.pojo.Ke;
import com.jiaoyu.pojo.KeExample;
import com.jiaoyu.pojo.KeExample.Criteria;
import com.jiaoyu.teacher.service.ClassificationService;
import com.jiaoyu.teacher.service.KeService;


import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout=10000)
public class KeServiceImpl implements KeService {

	@Autowired
	private KeMapper keMapper;
	
	
	@Reference
	private ClassificationService classificationService;
	
	
	/**
	 * 选项卡分类
	 */
	@Override
	public List<Ke> findByFirstId(Integer firstid){
		
		KeExample example=new KeExample();
		Criteria criteria = example.createCriteria();
		criteria.andFirstIdEqualTo(firstid);
		List<Ke> list = keMapper.selectByExample(example);
		return list;
	}
	
	/**
	 * 最受欢迎的课！！
	 */
	@Override
	public List<Ke> findPoupleList(){		
		List<Ke> list = keMapper.selectByPageNo(0, 10);
		return list;
	}
	
	
	
	@Override
	public List<Ke> findNewKeList() {
		List<Ke> list = keMapper.selectByNewKe(0, 7);
		return list;
	}
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Ke> findAll() {
		return keMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Ke> page=   (Page<Ke>) keMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Ke ke) {
		keMapper.insert(ke);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Ke ke){
		keMapper.updateByPrimaryKey(ke);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Ke findOne(Integer id){
		return keMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			keMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
public PageResult findPage(Ke ke, int pageNum, int pageSize) {
	PageHelper.startPage(pageNum, pageSize);
	
	KeExample example=new KeExample();
	Criteria criteria = example.createCriteria();
	
	if(ke!=null){			
					if(ke.getPublisherId()!=null && ke.getPublisherId().length()>0){
			criteria.andPublisherIdLike("%"+ke.getPublisherId()+"%");
		}
		if(ke.getTitle()!=null && ke.getTitle().length()>0){
			criteria.andTitleLike("%"+ke.getTitle()+"%");
		}
		if(ke.getImgurl()!=null && ke.getImgurl().length()>0){
			criteria.andImgurlLike("%"+ke.getImgurl()+"%");
		}
		if(ke.getKeurl()!=null && ke.getKeurl().length()>0){
			criteria.andKeurlLike("%"+ke.getKeurl()+"%");
		}
		if(ke.getCharge()!=null && ke.getCharge().length()>0){
			criteria.andChargeLike("%"+ke.getCharge()+"%");
		}
		if(ke.getDetails()!=null && ke.getDetails().length()>0){
			criteria.andDetailsLike("%"+ke.getDetails()+"%");
		}
		if(ke.getCompany()!=null && ke.getCompany().length()>0){
			criteria.andCompanyLike("%"+ke.getCompany()+"%");
		}
		if(ke.getIntended()!=null && ke.getIntended().length()>0){
			criteria.andIntendedLike("%"+ke.getIntended()+"%");
		}
		
		if(ke.getCoursetype()!=null && ke.getCoursetype().length()>0){
			criteria.andCoursetypeLike("%"+ke.getCoursetype()+"%");
		}
		if(ke.getKonwledgepoint()!=null && ke.getKonwledgepoint().length()>0){
			criteria.andKonwledgepointLike("%"+ke.getKonwledgepoint()+"%");
		}
		if(ke.getSem()!=null && ke.getSem().length()>0){
			criteria.andSemLike("%"+ke.getSem()+"%");
		}
		if(ke.getSecondname()!=null && ke.getSecondname().length()>0){
			criteria.andSecondnameLike("%"+ke.getSecondname()+"%");
		}
		if(ke.getFistname()!=null && ke.getFistname().length()>0){
			criteria.andFistnameLike("%"+ke.getFistname()+"%");
		}

	}
	
	Page<Ke> page= (Page<Ke>)keMapper.selectByExample(example);		
	return new PageResult(page.getTotal(), page.getResult());
}
		
		
		@Override
		public String findCfname(Integer keid) {
			Ke ke = findOne(keid);
			Integer firstId = ke.getFirstId();
			Long fid=new Long(firstId);
			Classification classification = classificationService.findOne(fid);			
			return classification.getCfname();
		}

		@Override
		public List<Ke> findKeListByUsername(String publicshid) {
			KeExample example=new KeExample();
			Criteria criteria = example.createCriteria();
			criteria.andPublisherIdEqualTo(publicshid);			
			List<Ke> list = keMapper.selectByExample(example);
			return list;
		}

		

	
}
