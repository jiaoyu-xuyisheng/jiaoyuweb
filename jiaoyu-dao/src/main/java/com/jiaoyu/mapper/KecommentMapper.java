package com.jiaoyu.mapper;

import com.jiaoyu.pojo.Kecomment;
import com.jiaoyu.pojo.KecommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KecommentMapper {
    int countByExample(KecommentExample example);

    int deleteByExample(KecommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Kecomment record);

    int insertSelective(Kecomment record);

    List<Kecomment> selectByExample(KecommentExample example);

    Kecomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Kecomment record, @Param("example") KecommentExample example);

    int updateByExample(@Param("record") Kecomment record, @Param("example") KecommentExample example);

    int updateByPrimaryKeySelective(Kecomment record);

    int updateByPrimaryKey(Kecomment record);
}