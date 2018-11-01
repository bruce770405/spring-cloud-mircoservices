package com.bruce.mircoservice.consumerwithhystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @Description: 使用enableTurbine 開啟Turbine
 * @Param: 
 * @return: 
 */
@EnableTurbine
@SpringBootApplication
public class ConsumerWithHystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerWithHystrixTurbineApplication.class, args);
    }
}
