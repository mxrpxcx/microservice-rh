package com.rh.folha.configuration;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

@Configuration
public class LoadBalancerConfiguration {

	@Bean
	public ServiceInstanceListSupplier staticServiceInstanceListSupplier() {
		return new ServiceInstanceListSupplier() {

			@Override
			public String getServiceId() {
				return "hr-funcionario";
			}

			@Override
			public Flux<List<ServiceInstance>> get() {
				List<ServiceInstance> instances = Arrays.asList(
						new DefaultServiceInstance("hr-funcionario1", "hr-funcionario", "localhost", 8081, false),
						new DefaultServiceInstance("hr-funcionario2", "hr-funcionario", "localhost", 8082, false));
				return Flux.just(instances);
			}
		};
	}

}
