package com.microservice.practice.discoverserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class DiscoverServerApplication {
    public static void main(String[] args) {

        SpringApplication.run(DiscoverServerApplication.class, args);
    }
}
