package com.app.config;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2017/3/10.
 */
@Component
public class MyHealth implements HealthIndicator {
    @Override
    public Health health() {
        /*int errorCode = getStatus(); // perform some specific health check
        if (errorCode != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }*/
        return Health.up().build();
    }
}
