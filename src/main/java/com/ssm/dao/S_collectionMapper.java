package com.ssm.dao;

import com.ssm.entity.S_collection;

public interface S_collectionMapper {
    int deleteByPrimaryKey(Integer clId);

    int insert(S_collection record);

    int insertSelective(S_collection record);

    S_collection selectByPrimaryKey(Integer clId);

    int updateByPrimaryKeySelective(S_collection record);

    int updateByPrimaryKey(S_collection record);
}