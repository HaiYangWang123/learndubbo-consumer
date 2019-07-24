package com.haiyang.learndubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.haiyang.api.demo.IDemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DemoController
 * @Description:
 * @Author: hywang
 * @CreateDate: 2019-07-24 11:43
 * @Version: 1.0
 */
@RestController
public class DemoController {

    @Reference(version = "1.0.0")
    private IDemoService demoService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return demoService.sayHello();
    }
}
