package com.ssm.dao;

import com.ssm.entity.S_user;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface S_userMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(S_user record);

    int insertSelective(S_user record);

    S_user selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(S_user record);

    int updateByPrimaryKey(S_user record);

    //查询所有用户的方法
    List<S_user> selectAllUsers();

    //根据用户名获取收藏的图书的方法
    List<S_user> getCollectBookByUsername(String username);
}