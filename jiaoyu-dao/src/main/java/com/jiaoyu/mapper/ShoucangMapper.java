package com.jiaoyu.mapper;

import com.jiaoyu.pojo.Shoucang;
import com.jiaoyu.pojo.ShoucangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoucangMapper {
    int countByExample(ShoucangExample example);

    int deleteByExample(ShoucangExample example);

    int deleteByPrimaryKey(Integer scid);

    int insert(Shoucang record);

    int insertSelective(Shoucang record);

    List<Shoucang> selectByExample(ShoucangExample example);

    Shoucang selectByPrimaryKey(Integer scid);

    int updateByExampleSelective(@Param("record") Shoucang record, @Param("example") ShoucangExample example);

    int updateByExample(@Param("record") Shoucang record, @Param("example") ShoucangExample example);

    int updateByPrimaryKeySelective(Shoucang record);

    int updateByPrimaryKey(Shoucang record);
}