package com.ssm.dao;

import com.ssm.entity.S_book;

public interface S_bookMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(S_book record);

    int insertSelective(S_book record);

    S_book selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(S_book record);

    int updateByPrimaryKey(S_book record);
}