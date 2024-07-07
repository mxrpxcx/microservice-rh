package com.rh.folha.configuration;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rh.folha.service.FuncionarioServiceInstanceListSupplier;

@Configuration
public class LoadBalancerConfiguration {

	@Bean
	public ServiceInstanceListSupplier funcionarioServiceInstanceListSupplier() {
		return new FuncionarioServiceInstanceListSupplier();
	}

}
