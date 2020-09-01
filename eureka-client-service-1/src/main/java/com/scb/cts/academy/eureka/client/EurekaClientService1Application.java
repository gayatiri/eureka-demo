package com.scb.cts.academy.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientService1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientService1Application.class, args);
	}

}
