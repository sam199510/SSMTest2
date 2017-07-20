package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.entity.S_user;
import com.ssm.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class SSMController {

    @Autowired
    private UserServiceI userServiceI;

    public void setUserServiceI(UserServiceI userServiceI) {
        this.userServiceI = userServiceI;
    }

    //根据用户名搜索收藏的图书的方法
    @RequestMapping(value = "getCollectBookByUsername", method = RequestMethod.GET)
    @ResponseBody
    public List<S_user> getCollectBookByUsername(String username) {
        List<S_user> s_users = this.userServiceI.getCollectBookByUsername(username);
        System.out.println(JSON.toJSONString(s_users));
        return s_users;
    }

    //搜索所有用户的方法
    @RequestMapping(value = "selectAllUsers", method = RequestMethod.GET)
    @ResponseBody
    public List<S_user> selectAllUsers(){
        List<S_user> s_users = this.userServiceI.selectAllUsers();
        System.out.println(JSON.toJSONString(s_users));
        return s_users;
    }
}
