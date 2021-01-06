package com.dk.microservices.currencyconversationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients("com.dk.microservices.currencyconversationservice")
@SpringBootApplication
public class CurrencyConversationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConversationServiceApplication.class, args);
    }

}
