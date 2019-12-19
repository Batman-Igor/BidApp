package com.binapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Allan on 19.12.2019.
 */
@SpringBootApplication
@EnableEurekaClient
public class GeneralMain {
    public static void main(String[] args) {
        SpringApplication.run(GeneralMain.class, args);
    }
}
