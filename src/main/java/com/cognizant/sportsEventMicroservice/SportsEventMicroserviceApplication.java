package com.cognizant.sportsEventMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SportsEventMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsEventMicroserviceApplication.class, args);
	}

}
