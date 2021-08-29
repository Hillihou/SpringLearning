package com.iweb;

import com.iweb.factory.factorybean;
import com.iweb.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("factoryBean1.xml");
        User bean1 = classPathXmlApplicationContext.getBean("bean1", User.class);
        System.out.println(bean1);
        classPathXmlApplicationContext.close();
    }
}
