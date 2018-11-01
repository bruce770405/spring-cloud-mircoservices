package com.bruce.consumerhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 1. 訪問 http://localhost:8030/hystrix.stream 可以查看Dashboard
 * 2. 在上面的输入框填入: http://想监控的服務:port/hystrix.stream 進行測試
 * 注意：首先要先调用一下想监控的服務API，否則將會顯示一個空的圖表.
 * @author BruceHsu
 * @Description: s.
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class ConsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerHystrixDashboardApplication.class).web(true).run(args);
//        SpringApplication.run(ConsumerHystrixDashboardApplication.class, args);
    }
}
