package com.ssm.dao;

import com.ssm.entity.S_comment;

public interface S_commentMapper {
    int deleteByPrimaryKey(Integer cmId);

    int insert(S_comment record);

    int insertSelective(S_comment record);

    S_comment selectByPrimaryKey(Integer cmId);

    int updateByPrimaryKeySelective(S_comment record);

    int updateByPrimaryKey(S_comment record);
}