package com.ohgiraffers.secondservice.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
  private Environment environment;

  // 의존성 주입이 자동으로 됨
  public SecondController(Environment environment) {
    this.environment = environment;
  }

  @GetMapping("/health")
  public String healthCheck(){
    return "Second Service is Ok. Port: " + environment.getProperty("local.server.port") + "";
  }

  @GetMapping("/message")
  public String message(
      @RequestHeader("second-request") String header
  ){
    return "second-request header : " + header;
  }

}
