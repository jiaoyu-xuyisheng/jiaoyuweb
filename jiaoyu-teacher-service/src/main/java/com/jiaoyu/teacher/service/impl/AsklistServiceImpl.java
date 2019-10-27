package com.jiaoyu.teacher.service.impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jiaoyu.mapper.AnswerMapper;
import com.jiaoyu.mapper.AsklistMapper;
import com.jiaoyu.pojo.AnswerExample;
import com.jiaoyu.pojo.Asklist;
import com.jiaoyu.pojo.AsklistExample;
import com.jiaoyu.pojo.AsklistExample.Criteria;
import com.jiaoyu.pojo.AsklistSon;
import com.jiaoyu.teacher.service.AsklistService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout=10000)
public class AsklistServiceImpl implements AsklistService {

	@Autowired
	private AsklistMapper asklistMapper;
	
	@Autowired
	private AnswerMapper answerMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Asklist> findAll() {
		return asklistMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Asklist> page=   (Page<Asklist>) asklistMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Asklist asklist) {
		asklistMapper.insert(asklist);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Asklist asklist){
		asklistMapper.updateByPrimaryKey(asklist);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Asklist findOne(Integer id){
		return asklistMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			asklistMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Asklist asklist, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		AsklistExample example=new AsklistExample();
		Criteria criteria = example.createCriteria();
		
		if(asklist!=null){			
						if(asklist.getAskContainer()!=null && asklist.getAskContainer().length()>0){
				criteria.andAskContainerLike("%"+asklist.getAskContainer()+"%");
			}
			if(asklist.getAskTitle()!=null && asklist.getAskTitle().length()>0){
				criteria.andAskTitleLike("%"+asklist.getAskTitle()+"%");
			}
			if(asklist.getUsername()!=null && asklist.getUsername().length()>0){
				criteria.andUsernameLike("%"+asklist.getUsername()+"%");
			}
	
		}
		
		Page<Asklist> page= (Page<Asklist>)asklistMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		
		/**
		 * 找到课程的提问的方法
		 */
			@Override
		public Map<String,Object>  findAskListByKeId(Integer keid,Integer pageNum,Integer pageSize) {
			
						
			AsklistExample example=new AsklistExample();
			Criteria criteria = example.createCriteria();
			criteria.andKeIdEqualTo(keid);
			List<Asklist> list = asklistMapper.selectByExample(example);
			List<AsklistSon> listmap=new ArrayList<AsklistSon>();
			for (Asklist ask : list) {
				
				AsklistSon asklistson=new AsklistSon();
				
				asklistson.setAskid(ask.getAskid());
				asklistson.setKeId(ask.getKeId());
				asklistson.setAskContainer(ask.getAskContainer());
				asklistson.setAskDatetime(ask.getAskDatetime());
				asklistson.setAskTitle(ask.getAskTitle());
				asklistson.setAskurl(ask.getAskurl());
				asklistson.setStatus(ask.getStatus());
				asklistson.setUsername(ask.getUsername());
				asklistson.setUserId(ask.getUserId());
				asklistson.setView(ask.getView());
				asklistson.setAnswercount(getCount(ask.getAskid()));
				listmap.add(asklistson);
			}	
			
			List<AsklistSon> list2=new ArrayList<AsklistSon>();
			for(Integer i=((pageNum-1)*pageSize);i<pageNum*pageSize;i++) {
				if(i<listmap.size()) {
				list2.add(listmap.get(i));
				}
			}
			
			Map<String,Object> pagemap=new HashMap<String,Object>();
			pagemap.put("pageCount", listmap.size());
			pagemap.put("askResult", list2);
			
			return pagemap;
		}
		
		
		public Integer getCount(Integer askid) {
			AnswerExample e=new AnswerExample();
			com.jiaoyu.pojo.AnswerExample.Criteria c = e.createCriteria();
			c.andAskidEqualTo(askid);			
			int i = answerMapper.countByExample(e);
			return i;
		}

		
		
		
		@Override
		public List<Map<String,Object>>  findAskByUsername(String username) {
						
			AsklistExample example=new AsklistExample();
			Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(username);
			List<Asklist> list = asklistMapper.selectByExample(example);
			
			List<Map<String,Object>> listmap=new ArrayList<Map<String,Object>>();
			for (Asklist ask : list) {
				Map<String,Object> askMap=new HashMap<String,Object>();
				askMap.put("askid", ask.getAskid());
				askMap.put("keId", ask.getKeId());
				askMap.put("askContainer", ask.getAskContainer());
				askMap.put("askDatetime", ask.getAskDatetime());
				askMap.put("askTitle", ask.getAskTitle());			
				askMap.put("askurl", ask.getAskurl());
				askMap.put("status",ask.getStatus());
				askMap.put("username", ask.getUsername());
				askMap.put("view",ask.getView());
				askMap.put("answercount",getCount(ask.getAskid()));
				listmap.add(askMap);
			}		
			
			return listmap;			
		}
	
}
