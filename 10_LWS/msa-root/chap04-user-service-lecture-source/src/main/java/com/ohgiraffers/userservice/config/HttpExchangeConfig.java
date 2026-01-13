package com.ohgiraffers.userservice.config;

import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpExchangeConfig {
    @Bean
    HttpExchangeRepository httpsExchangeRepository(){
        return new InMemoryHttpExchangeRepository();
        // 저장후 교환
    }
}
