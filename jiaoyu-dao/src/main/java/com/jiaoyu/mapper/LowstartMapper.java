package com.jiaoyu.mapper;

import com.jiaoyu.pojo.Lowstart;
import com.jiaoyu.pojo.LowstartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LowstartMapper {
    int countByExample(LowstartExample example);

    int deleteByExample(LowstartExample example);

    int deleteByPrimaryKey(Integer lowid);

    int insert(Lowstart record);

    int insertSelective(Lowstart record);

    List<Lowstart> selectByExample(LowstartExample example);

    Lowstart selectByPrimaryKey(Integer lowid);

    int updateByExampleSelective(@Param("record") Lowstart record, @Param("example") LowstartExample example);

    int updateByExample(@Param("record") Lowstart record, @Param("example") LowstartExample example);

    int updateByPrimaryKeySelective(Lowstart record);

    int updateByPrimaryKey(Lowstart record);
}