package com.iweb;

import com.iweb.collection.stu;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("SutContext.xml");
        stu stu1 = classPathXmlApplicationContext.getBean("stu1", stu.class);
        System.out.println(stu1);
    }
}
