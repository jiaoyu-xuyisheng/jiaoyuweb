package com.jiaoyu.mapper;

import com.jiaoyu.pojo.FriendlyLink;
import com.jiaoyu.pojo.FriendlyLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendlyLinkMapper {
    int countByExample(FriendlyLinkExample example);

    int deleteByExample(FriendlyLinkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FriendlyLink record);

    int insertSelective(FriendlyLink record);

    List<FriendlyLink> selectByExample(FriendlyLinkExample example);

    FriendlyLink selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FriendlyLink record, @Param("example") FriendlyLinkExample example);

    int updateByExample(@Param("record") FriendlyLink record, @Param("example") FriendlyLinkExample example);

    int updateByPrimaryKeySelective(FriendlyLink record);

    int updateByPrimaryKey(FriendlyLink record);
}