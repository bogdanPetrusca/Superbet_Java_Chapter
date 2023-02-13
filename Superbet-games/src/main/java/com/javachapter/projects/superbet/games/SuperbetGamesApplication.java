package com.javachapter.projects.superbet.games;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication
@EnableScheduling
@EnableDiscoveryClient
public class SuperbetGamesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperbetGamesApplication.class, args);
    }

}
