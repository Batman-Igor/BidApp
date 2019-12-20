package com.binapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GeneralMain {
    public static void main(String[] args) {
        SpringApplication.run(GeneralMain.class, args);
    }
}
