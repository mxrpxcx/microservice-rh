package com.rh.folha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RhFolhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhFolhaApplication.class, args);
	}

}
