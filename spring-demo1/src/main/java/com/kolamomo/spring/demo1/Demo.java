package com.kolamomo.spring.demo1;

import com.kolamomo.spring.demo1.service.HelloService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.hello();
    }
}
