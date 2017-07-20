package com.ssm.dao;

import com.ssm.entity.S_indent;

public interface S_indentMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(S_indent record);

    int insertSelective(S_indent record);

    S_indent selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(S_indent record);

    int updateByPrimaryKey(S_indent record);
}