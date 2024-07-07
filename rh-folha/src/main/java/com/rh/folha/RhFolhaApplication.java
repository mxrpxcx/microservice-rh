package com.rh.folha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.rh.folha.configuration.LoadBalancerConfiguration;

@EnableDiscoveryClient
//@LoadBalancerClient(name = "rh-funcionario", configuration = LoadBalancerConfiguration.class)
@SpringBootApplication
@EnableFeignClients
public class RhFolhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhFolhaApplication.class, args);
	}

}
