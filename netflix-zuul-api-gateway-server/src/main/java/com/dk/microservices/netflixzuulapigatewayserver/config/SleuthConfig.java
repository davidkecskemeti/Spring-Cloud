package com.dk.microservices.netflixzuulapigatewayserver.config;

import brave.sampler.Sampler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class SleuthConfig {

    @Bean
    public Sampler defaultSampler() {
        log.info("Sampler configuration");
        return Sampler.ALWAYS_SAMPLE;
    }
}
