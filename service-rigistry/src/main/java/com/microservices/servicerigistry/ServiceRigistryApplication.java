package com.microservices.servicerigistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRigistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRigistryApplication.class, args);
	}

}
