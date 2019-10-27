package com.jiaoyu.mapper;

import com.jiaoyu.pojo.Mynews;
import com.jiaoyu.pojo.MynewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MynewsMapper {
    int countByExample(MynewsExample example);

    int deleteByExample(MynewsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Mynews record);

    int insertSelective(Mynews record);

    List<Mynews> selectByExample(MynewsExample example);
    
    List<Mynews> selectByPageNo(Integer page,Integer pageSize);

    Mynews selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Mynews record, @Param("example") MynewsExample example);

    int updateByExample(@Param("record") Mynews record, @Param("example") MynewsExample example);

    int updateByPrimaryKeySelective(Mynews record);

    int updateByPrimaryKey(Mynews record);
}