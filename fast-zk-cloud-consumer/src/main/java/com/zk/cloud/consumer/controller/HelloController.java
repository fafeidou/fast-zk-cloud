package com.zk.cloud.consumer.controller;

import com.zk.cloud.openapi.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2020/4/2 13:51
 * @Created by qinfuxiang
 */
@RestController
public class HelloController {
    @Autowired
    ServiceHi serviceHi;

    @GetMapping("hello")
    public String hello(String name) {
        return serviceHi.hello(name);
    }

}
