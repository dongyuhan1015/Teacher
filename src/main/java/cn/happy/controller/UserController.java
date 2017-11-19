package cn.happy.controller;

import cn.happy.entity.User;
import cn.happy.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


/**
 * Created by lenovo on 2017/9/27.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name ="userService" )
    UserServiceImpl service;
    //登录
    @RequestMapping("/doLogin")
    public String doLogin(HttpSession session, User info){
        User user=service.isLogin(info);
        if (user!=null && user.getUsername()!=null){
            session.setAttribute("userinfo",user.getUsername());
            return "user";
        }else {
            return "login";
        }
    }
}
