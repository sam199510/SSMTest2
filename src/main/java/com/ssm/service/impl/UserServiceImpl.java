package com.ssm.service.impl;

import com.ssm.dao.S_userMapper;
import com.ssm.entity.S_user;
import com.ssm.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//业务层和事务注解配置
@Service
@Transactional
public class UserServiceImpl implements UserServiceI {

    //将userMapper容器注入
    @Autowired
    private S_userMapper s_userMapper;

    public void setS_userMapper(S_userMapper s_userMapper) {
        this.s_userMapper = s_userMapper;
    }

    //查询所有用户的方法
    @Override
    public List<S_user> selectAllUsers() {
        return this.s_userMapper.selectAllUsers();
    }

    //根据用户名获取收藏的图书的方法
    @Override
    public List<S_user> getCollectBookByUsername(String username) {
        return this.s_userMapper.getCollectBookByUsername(username);
    }
}
