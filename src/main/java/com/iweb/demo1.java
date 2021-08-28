package com.iweb;

import com.iweb.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User u1 = applicationContext.getBean("u1", User.class);
        System.out.println(u1);

        User u2 = applicationContext.getBean("u2", User.class);
        System.out.println(u2);

        User u3 = applicationContext.getBean("u3", User.class);
        System.out.println(u3);

        User u4 = applicationContext.getBean("u4", User.class);
        System.out.println(u4);

        User u5 = applicationContext.getBean("u5", User.class);
        System.out.println(u5);







    }
}
