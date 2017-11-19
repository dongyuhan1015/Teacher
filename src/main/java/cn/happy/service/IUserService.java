package cn.happy.service;

import cn.happy.entity.User;

/**
 * Created by lenovo on 2017/9/27.
 */
public interface IUserService {
    //登录的方法
    public User isLogin(User info);
}
