package com.eaf.eaftestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.eaf.security")
public class RestaurantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantServiceApplication.class, args);
	}

}

