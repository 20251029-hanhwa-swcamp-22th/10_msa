package com.ohgiraffers.firstservice.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
  private Environment environment;

  // 의존성 주입이 자동으로 됨
  public FirstController(Environment environment) {
    this.environment = environment;
  }

  @GetMapping("/health")
  public String healthCheck(){
    return "First Service is Ok. Port: " + environment.getProperty("local.server.port") + "";
  }

  @GetMapping("/message")
  public String message(
      @RequestHeader("first-request") String header
  ){
    return "first-request header : " + header;
  }

}
