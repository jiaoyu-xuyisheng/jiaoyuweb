package com.jiaoyu.mapper;

import com.jiaoyu.pojo.Kegd;
import com.jiaoyu.pojo.KegdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KegdMapper {
    int countByExample(KegdExample example);

    int deleteByExample(KegdExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Kegd record);

    int insertSelective(Kegd record);

    List<Kegd> selectByExample(KegdExample example);

    Kegd selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Kegd record, @Param("example") KegdExample example);

    int updateByExample(@Param("record") Kegd record, @Param("example") KegdExample example);

    int updateByPrimaryKeySelective(Kegd record);

    int updateByPrimaryKey(Kegd record);
}