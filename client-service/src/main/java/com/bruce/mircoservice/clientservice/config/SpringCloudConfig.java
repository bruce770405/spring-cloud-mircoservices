package com.bruce.mircoservice.clientservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * config for spring.
 * @author BruceHsu
 * @version 1.0 2018/02/01
 * @since
 * @see
 * @serial
 */
@Configuration
@EnableSwagger2
@EnableRetry
public class SpringCloudConfig {

}
