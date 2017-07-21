package com.ssm.service;

import com.ssm.entity.S_user;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserServiceI {
    //查询所有用户的方法
    List<S_user> selectAllUsers();

    //根据用户名获取收藏的图书的方法
    List<S_user> getCollectBookByUsername(String username);

    //根据用户名搜索评论的方法
    List<S_user> getCommentContentByUsername(String username);
}
