package com.jiaoyu.teacher.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.KegdMapper;
import com.jiaoyu.pojo.Kegd;
import com.jiaoyu.pojo.KegdExample;
import com.jiaoyu.pojo.KegdExample.Criteria;
import com.jiaoyu.teacher.service.KegdService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout=10000)
public class KegdServiceImpl implements KegdService {

	@Autowired
	private KegdMapper kegdMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Kegd> findAll() {
		return kegdMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Kegd> page=   (Page<Kegd>) kegdMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Kegd kegd) {
		kegdMapper.insert(kegd);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Kegd kegd){
		kegdMapper.updateByPrimaryKey(kegd);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Kegd findOne(Long id){
		return kegdMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			kegdMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Kegd kegd, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		KegdExample example=new KegdExample();
		Criteria criteria = example.createCriteria();
		
		if(kegd!=null){			
						if(kegd.getGdimg()!=null && kegd.getGdimg().length()>0){
				criteria.andGdimgLike("%"+kegd.getGdimg()+"%");
			}
			if(kegd.getGdbackground()!=null && kegd.getGdbackground().length()>0){
				criteria.andGdbackgroundLike("%"+kegd.getGdbackground()+"%");
			}
			if(kegd.getGdurl()!=null && kegd.getGdurl().length()>0){
				criteria.andGdurlLike("%"+kegd.getGdurl()+"%");
			}
			if(kegd.getGdusername()!=null && kegd.getGdusername().length()>0){
				criteria.andGdusernameLike("%"+kegd.getGdusername()+"%");
			}
	
		}
		
		Page<Kegd> page= (Page<Kegd>)kegdMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
