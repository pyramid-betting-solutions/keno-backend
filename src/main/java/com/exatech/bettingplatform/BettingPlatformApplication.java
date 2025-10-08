package com.exatech.bettingplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BettingPlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(BettingPlatformApplication.class, args);
    }
}
