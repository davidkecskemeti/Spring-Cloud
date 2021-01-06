package com.dk.microservices.currencyexchangeservice.controller;

import com.dk.microservices.currencyexchangeservice.bean.ExchangeValue;
import com.dk.microservices.currencyexchangeservice.repository.ExchangeValueRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@Slf4j
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
        exchangeValue.setPort(Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port"))));
        log.info("{}", exchangeValue);
        return exchangeValue;
    }
}