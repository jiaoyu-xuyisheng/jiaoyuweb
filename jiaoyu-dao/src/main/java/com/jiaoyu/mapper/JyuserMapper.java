package com.jiaoyu.mapper;

import com.jiaoyu.pojo.Jyuser;
import com.jiaoyu.pojo.JyuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JyuserMapper {
    int countByExample(JyuserExample example);

    int deleteByExample(JyuserExample example);

    int deleteByPrimaryKey(String jyUsername);

    int insert(Jyuser record);

    int insertSelective(Jyuser record);

    List<Jyuser> selectByExample(JyuserExample example);

    Jyuser selectByPrimaryKey(String jyUsername);

    int updateByExampleSelective(@Param("record") Jyuser record, @Param("example") JyuserExample example);

    int updateByExample(@Param("record") Jyuser record, @Param("example") JyuserExample example);

    int updateByPrimaryKeySelective(Jyuser record);

    int updateByPrimaryKey(Jyuser record);
}