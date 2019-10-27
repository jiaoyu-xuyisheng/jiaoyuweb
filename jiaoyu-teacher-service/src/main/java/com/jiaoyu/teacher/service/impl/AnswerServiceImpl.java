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
import com.jiaoyu.pojo.Answer;
import com.jiaoyu.pojo.AnswerExample;
import com.jiaoyu.pojo.AnswerExample.Criteria;
import com.jiaoyu.pojo.Asklist;
import com.jiaoyu.pojo.AsklistExample;
import com.jiaoyu.teacher.service.AnswerService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout=10000)
public class AnswerServiceImpl implements AnswerService {

	@Autowired
	private AnswerMapper answerMapper;
	

	@Autowired
	private AsklistMapper asklistMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Answer> findAll() {
		return answerMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Answer> page=   (Page<Answer>) answerMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Answer answer) {
		answerMapper.insert(answer);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Answer answer){
		answerMapper.updateByPrimaryKey(answer);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Answer findOne(Integer id){
		return answerMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			answerMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Answer answer, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		AnswerExample example=new AnswerExample();
		Criteria criteria = example.createCriteria();
		
		if(answer!=null){			
						if(answer.getUsername()!=null && answer.getUsername().length()>0){
				criteria.andUsernameLike("%"+answer.getUsername()+"%");
			}
			if(answer.getJyHeadpic()!=null && answer.getJyHeadpic().length()>0){
				criteria.andJyHeadpicLike("%"+answer.getJyHeadpic()+"%");
			}
			if(answer.getContainer()!=null && answer.getContainer().length()>0){
				criteria.andContainerLike("%"+answer.getContainer()+"%");
			}
	
		}
		
		Page<Answer> page= (Page<Answer>)answerMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public Integer findAskCount(Integer askid) {			
			AnswerExample example=new AnswerExample();
			Criteria criteria = example.createCriteria();
			criteria.andAskidEqualTo(askid);			
			int i = answerMapper.countByExample(example);
			return i;
		}

		@Override
		public PageResult findAnswerListByAskId(Integer askid, int pageNum, int pageSize) {
			PageHelper.startPage(pageNum, pageSize);
			AnswerExample example=new AnswerExample();
			Criteria criteria = example.createCriteria();
			criteria.andAskidEqualTo(askid);		
			Page<Answer> page= (Page<Answer>)answerMapper.selectByExample(example);	
			
			return new PageResult(page.getTotal(), page.getResult());
		}

		
	
		@Override
		public List<Map<String, Object>> findAnswerByUsername(String username) {
			AnswerExample example=new AnswerExample();
			Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(username);			
			List<Answer> list = answerMapper.selectByExample(example);
			List<Map<String, Object>> listmap=new ArrayList<Map<String,Object>>();
			for (Answer answer : list) {
				Map<String,Object> ansmap=new HashMap<String,Object>();
				String url = findUrl(answer.getAskid());
				ansmap.put("askurl", url);
				ansmap.put("answerid", answer.getAskid());
				ansmap.put("username",answer.getUsername());
				ansmap.put("answerdate", answer.getAuswerdate());
				ansmap.put("upstart", answer.getUpstart());
				ansmap.put("lowstart", answer.getLowstart());
				ansmap.put("adopt", answer.getAdopt());
				ansmap.put("container", answer.getContainer());	
				listmap.add(ansmap);
			}
			return listmap;
		}
		
		
		public String findUrl(Integer askid) {		
			Asklist asklist = asklistMapper.selectByPrimaryKey(askid);
			String askurl = asklist.getAskurl();
			return askurl;			
		}
	
}
