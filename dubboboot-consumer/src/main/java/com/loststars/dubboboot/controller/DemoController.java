package com.loststars.dubboboot.controller;

import com.loststars.dubboboot.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello() {
        return demoService.sayHello("Dubbo");
    }
}
