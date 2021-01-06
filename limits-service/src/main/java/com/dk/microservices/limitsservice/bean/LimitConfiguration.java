package com.dk.microservices.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LimitConfiguration {

    private int maximum;
    private int minimum;

}
