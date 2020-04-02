package com.zk.cloud.provider.controller;

import com.zk.cloud.openapi.ServiceHi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2020/4/2 13:47
 * @Created by qinfuxiang
 */
@RestController
public class HelloController implements ServiceHi {

    @Override
    public String hello(String name) {
        return "hello" + name;
    }

}
