package com.example.microservice.domaine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class DomaineApplication {

    public static void main(String[] args) {
        SpringApplication.run(DomaineApplication.class, args);
    }

}
