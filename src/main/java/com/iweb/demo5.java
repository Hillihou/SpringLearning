package com.iweb;

import com.iweb.collection.book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bookContext.xml");
        book book = classPathXmlApplicationContext.getBean("book", book.class);
        System.out.println(book);
    }
}
