package com.iweb;

import com.iweb.pojo.emp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        emp emp3 = classPathXmlApplicationContext.getBean("emp3", emp.class);

        System.out.println(emp3);


    }
}
