package com.example.apidistribuidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class ApiDistribuidosApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiDistribuidosApplication.class, args);
    }
}