package com.iweb.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //初始化执行前的操作
        System.out.println("初始化执行前的操作");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //初始化执行后的操作
        System.out.println("初始化执行后的操作");
        return bean;
    }
}
