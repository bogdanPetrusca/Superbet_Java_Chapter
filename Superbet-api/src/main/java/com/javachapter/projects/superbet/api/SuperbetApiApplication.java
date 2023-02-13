package com.javachapter.projects.superbet.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SuperbetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperbetApiApplication.class, args);
	}

}
