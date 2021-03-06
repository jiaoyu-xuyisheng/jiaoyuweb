package com.jiaoyu.mapper;

import com.jiaoyu.pojo.Ke;
import com.jiaoyu.pojo.KeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeMapper {
    int countByExample(KeExample example);

    int deleteByExample(KeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ke record);

    int insertSelective(Ke record);

    List<Ke> selectByExample(KeExample example);
    
    List<Ke> selectByPageNo(Integer page,Integer pageSize);
    
    List<Ke> selectByNewKe(Integer page,Integer pageSize);

    Ke selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ke record, @Param("example") KeExample example);

    int updateByExample(@Param("record") Ke record, @Param("example") KeExample example);

    int updateByPrimaryKeySelective(Ke record);

    int updateByPrimaryKey(Ke record);
}