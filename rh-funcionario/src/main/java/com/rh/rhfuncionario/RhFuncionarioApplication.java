package com.rh.rhfuncionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rh.rhfuncionario.repository")
@EntityScan(basePackages = "com.rh.rhfuncionario.entity")
public class RhFuncionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhFuncionarioApplication.class, args);
	}

}
