package com.jiaoyu.teacher.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.HighlightOptions;
import org.springframework.data.solr.core.query.HighlightQuery;
import org.springframework.data.solr.core.query.SimpleHighlightQuery;
import org.springframework.data.solr.core.query.result.HighlightEntry;
import org.springframework.data.solr.core.query.result.HighlightPage;
import com.alibaba.dubbo.config.annotation.Service;
import com.jiaoyu.pojo.Ke;
import com.jiaoyu.teacher.service.SearchService;



@Service(timeout=3000)
public class SearchServiceImpl implements SearchService {
	

	@Autowired
	private SolrTemplate solrTemplate;

	@Override
	public Map<String, Object> searchke(Map<String,Object> searchMap) {
		
		Map<String,Object> map=new HashMap<String,Object>();
		HighlightQuery query=new SimpleHighlightQuery();
		HighlightOptions highlightOptions=new HighlightOptions().addField("ke_title");
		highlightOptions.setSimplePrefix("<em style='color:yellow'>");
		highlightOptions.setSimplePostfix("</em>");
		//设置高亮
		query.setHighlightOptions(highlightOptions);
		//1.1关键字查询
		Criteria criteria=new Criteria("item_keywords").is(searchMap.get("keywords"));
		query.addCriteria(criteria);		
		//1.6分页查询 pageNo
		Integer pageNo=(Integer) searchMap.get("pageNo");
		if(pageNo==null) {
			pageNo=1;
		}
		
		Integer pageSize=(Integer) searchMap.get("pageSize");
		
		if(pageSize==null) {
			pageSize=20;
		}
		query.setOffset((pageNo-1)*pageSize);
		query.setRows(pageSize);
		
		
		//1.7排序
		String sortValue=(String)searchMap.get("sort");//ASC DESC
		String sortField=(String)searchMap.get("sortField");//排序字段
		if(sortValue!=null&&!sortValue.equals("")) {
			Sort sort=new Sort(Sort.Direction.ASC,"ke_"+sortField);
			query.addSort(sort);
		}
		
		if(sortValue!=null&&!sortValue.equals("")&&sortValue.equals("DESC")) {
			Sort sort=new Sort(Sort.Direction.DESC,"ke_"+sortField);
			query.addSort(sort);
		}
		
		//**********************************************************************************
		HighlightPage<Ke> page = solrTemplate.queryForHighlightPage(query, Ke.class);
		//高亮入口
		List<HighlightEntry<Ke>> highlighted = page.getHighlighted();
		for (HighlightEntry<Ke> h : highlighted) {
			Ke ke = h.getEntity();//获取原实体类
			if(h.getHighlights().size()>0&&h.getHighlights().get(0).getSnipplets().size()>0) {
				ke.setTitle(h.getHighlights().get(0).getSnipplets().get(0));//设置高亮结果
			}
			
		}
		map.put("rows", page.getContent());
		map.put("totalPages", page.getTotalPages());//总页数
		map.put("total", page.getTotalElements());//总条数;
		
		return map;
		
	}

	

}
