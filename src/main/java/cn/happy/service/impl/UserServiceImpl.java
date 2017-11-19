package cn.happy.service.impl;

import cn.happy.dao.IUserDAO;
import cn.happy.entity.User;
import cn.happy.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/9/27.
 */
@Service("userService")
public class UserServiceImpl implements IUserService{
    @Resource(name = "IUserDAO")
    IUserDAO dao;
    public User isLogin(User info) {
        return dao.isLogin(info);
    }

    public IUserDAO getDao() {
        return dao;
    }

    public void setDao(IUserDAO dao) {
        this.dao = dao;
    }
}
