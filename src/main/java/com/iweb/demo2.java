package com.iweb;

import com.iweb.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        userService.add();


    }
}
