package com.bruce.mircoservice.clientservice.config;

import com.bruce.mircoservice.clientservice.custom.error.CustomException;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class RocketMQHealthIndicator implements HealthIndicator {

    private CustomException error;

    @Override
    public Health health() {
        if(checkError()){
            Health.down().withDetail("error",error).build();
        }

        return Health.up().build();
    }

    private boolean checkError(){
        //

        //
        error = new CustomException();
        return true;
    }
}
