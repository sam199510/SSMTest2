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

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
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
                String filePath = request.getSession().getServletContext().getRealPath("/") + "/images/" + file.getOriginalFilename();

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
    @ResponseBody
    public String uploadFileForm(@RequestParam("file")MultipartFile[] files){

        System.out.println("上传");

//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");

        if (files!=null&&files.length>0) {
            for (int i = 0; i < files.length; i++) {
                MultipartFile file=files[i];
                if (uploadFile(file)) {
                    return "上传成功";
                } else {
                    return "上传失败";
                }
//                uploadFile(file);
            }
        }
        return "";
    }

    @RequestMapping("getPicture")
    public String getPicture() throws UnknownHostException {

        String address = InetAddress.getLocalHost().getHostAddress();

        return "redirect:http://"+address+":8080/getPhoto.html";

    }


    /**
     * 获取图片
     */
    @RequestMapping("getPhoto")
    protected void service(HttpServletResponse response)
            throws ServletException, IOException {

        OutputStream os = response.getOutputStream();
        File file = new File("/Users/fei/Documents/Workspace/IDEAWorkspace/J2EE/SSMTest2/src/main/webapp/images/222.png");
        FileInputStream fips = new FileInputStream(file);
        byte[] btImg = readStream(fips);
        os.write(btImg);
        os.flush();

    }

    /**
     * 读取管道中的流数据
     */
    public byte[] readStream(InputStream inStream) {

        ByteArrayOutputStream bops = new ByteArrayOutputStream();
        int data = -1;
        try {
            while((data = inStream.read()) != -1){
                bops.write(data);
            }
            return bops.toByteArray();
        }catch(Exception e){
            return null;
        }
    }

}
