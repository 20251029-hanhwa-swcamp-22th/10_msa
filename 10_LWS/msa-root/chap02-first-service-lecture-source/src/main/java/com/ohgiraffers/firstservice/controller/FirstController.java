package com.ohgiraffers.firstservice.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    private Environment environment;

    public FirstController(Environment environment){
        this.environment = environment;
    }
    @GetMapping("/health")
    public String healthCheck(){
        return "First Service is OK.Port ="
                + environment.getProperty("local.server.port");
    }
    @GetMapping("/message")
    public String messge(@RequestHeader("first-request") String header){
        return "first-request header : " + header;
    }

}
