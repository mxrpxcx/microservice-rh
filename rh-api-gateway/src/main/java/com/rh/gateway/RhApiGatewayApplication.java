package com.rh.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RhApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhApiGatewayApplication.class, args);
	}

}
