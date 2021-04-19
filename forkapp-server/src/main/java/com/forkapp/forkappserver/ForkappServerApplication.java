package com.forkapp.forkappserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ForkappServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForkappServerApplication.class, args);
	}

}
