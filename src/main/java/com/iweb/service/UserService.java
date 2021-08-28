package com.iweb.service;

import com.iweb.dao.UserDao;

public class UserService {

    //创建userDao属性，并且生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("Service-----add");
        userDao.update();
    }


}
