package com.haiyang.learndubboconsumer;

import com.haiyang.api.demo.IDemoService;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LearndubboConsumerApplication {

    public static void main(String[] args) {
        /*SpringApplication.run(LearndubboConsumerApplication.class, args);
        System.out.println("server start");*/

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        IDemoService demoService = (IDemoService) context.getBean("demoService");
        String hello = demoService.sayHello();
        System.out.println(hello);
    }

}
