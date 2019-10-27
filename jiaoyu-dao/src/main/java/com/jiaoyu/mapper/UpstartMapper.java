package com.jiaoyu.mapper;

import com.jiaoyu.pojo.Upstart;
import com.jiaoyu.pojo.UpstartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpstartMapper {
    int countByExample(UpstartExample example);

    int deleteByExample(UpstartExample example);

    int deleteByPrimaryKey(Integer upid);

    int insert(Upstart record);

    int insertSelective(Upstart record);

    List<Upstart> selectByExample(UpstartExample example);

    Upstart selectByPrimaryKey(Integer upid);

    int updateByExampleSelective(@Param("record") Upstart record, @Param("example") UpstartExample example);

    int updateByExample(@Param("record") Upstart record, @Param("example") UpstartExample example);

    int updateByPrimaryKeySelective(Upstart record);

    int updateByPrimaryKey(Upstart record);
}