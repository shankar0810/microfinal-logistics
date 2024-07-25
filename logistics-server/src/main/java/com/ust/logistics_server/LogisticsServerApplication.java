package com.ust.logistics_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LogisticsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogisticsServerApplication.class, args);
	}

}
