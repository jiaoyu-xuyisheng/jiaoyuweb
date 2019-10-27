package com.jiaoyu.teacher.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.LowstartMapper;
import com.jiaoyu.pojo.Lowstart;
import com.jiaoyu.pojo.LowstartExample;
import com.jiaoyu.pojo.LowstartExample.Criteria;
import com.jiaoyu.teacher.service.LowstartService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class LowstartServiceImpl implements LowstartService {

	@Autowired
	private LowstartMapper lowstartMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Lowstart> findAll() {
		return lowstartMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Lowstart> page=   (Page<Lowstart>) lowstartMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Lowstart lowstart) {
		lowstartMapper.insert(lowstart);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Lowstart lowstart){
		lowstartMapper.updateByPrimaryKey(lowstart);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Lowstart findOne(Integer id){
		return lowstartMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			lowstartMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Lowstart lowstart, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		LowstartExample example=new LowstartExample();
		Criteria criteria = example.createCriteria();
		
		if(lowstart!=null){			
						if(lowstart.getLowusername()!=null && lowstart.getLowusername().length()>0){
				criteria.andLowusernameLike("%"+lowstart.getLowusername()+"%");
			}
			if(lowstart.getAnusername()!=null && lowstart.getAnusername().length()>0){
				criteria.andAnusernameLike("%"+lowstart.getAnusername()+"%");
			}
	
		}
		
		Page<Lowstart> page= (Page<Lowstart>)lowstartMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public Lowstart findByAnswerIdAndUserName(Integer answerid, String lowusername) {
			LowstartExample example=new LowstartExample();
			Criteria criteria = example.createCriteria();
			criteria.andAnsweridEqualTo(answerid);
			criteria.andLowusernameEqualTo(lowusername);			
			List<Lowstart> lowlist = lowstartMapper.selectByExample(example);
			if(lowlist==null||lowlist.size()==0) {
				return null;
			}else {
				return lowlist.get(0);
			}
			
		}
	
}
