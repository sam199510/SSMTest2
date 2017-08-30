package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.entity.S_user;
import com.ssm.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class SSMController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private UserServiceI userServiceI;

    public void setUserServiceI(UserServiceI userServiceI) {
        this.userServiceI = userServiceI;
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String indexPage(){
        return "index";
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
        return s_users;
    }

    //根据用户名搜索评论的方法
    @RequestMapping(value = "getCommentContentByUsername", method = RequestMethod.GET)
    @ResponseBody
    public List<S_user> getCommentContentByUsername(String username){
        List<S_user> s_users = this.userServiceI.getCommentContentByUsername(username);
        System.out.println(JSON.toJSONString(s_users));
        return s_users;
    }

    private boolean uploadFile(MultipartFile file){
        if (!file.isEmpty()) {
            try {
                String filePath = request.getSession().getServletContext().getRealPath("") + "/frontend/otherFiles/" + file.getOriginalFilename();

                System.out.println(filePath);

                file.transferTo(new File(filePath));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    //文件上传
    @RequestMapping(value = "uploadFile" , method = RequestMethod.POST)
    public ModelAndView uploadFileForm(@RequestParam("file")MultipartFile file){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        uploadFile(file);

        return modelAndView;
    }
}
