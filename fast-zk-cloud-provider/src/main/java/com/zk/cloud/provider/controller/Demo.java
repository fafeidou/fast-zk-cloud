package com.zk.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo
 * @Description TODO
 * @Date 2020/4/2 11:55
 * @Created by qinfuxiang
 */
@RestController
public class Demo {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/services")
    public List<String> serviceUrl() {
        List<ServiceInstance> list;
        List<String> services = new ArrayList<>();
        List<String> services1 = discoveryClient.getServices();
        System.out.println(services1.toString());
        for (String s : services1) {
            list = discoveryClient.getInstances(s);
            for (ServiceInstance serviceInstance : list) {
                System.out.println(serviceInstance.getUri().toString());
                services.add(serviceInstance.getUri().toString());
            }
        }
        return services;
    }
}
