package com.rh.folha.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;

import reactor.core.publisher.Flux;

public class FuncionarioServiceInstanceListSupplier implements ServiceInstanceListSupplier {

	@Override
	public String getServiceId() {
		return "hr-funcionario";
	}

	@Override
	public Flux<List<ServiceInstance>> get() {
		List<ServiceInstance> instances = Arrays.asList(
				new DefaultServiceInstance(getServiceId() + "1", "hr-funcionario", "localhost", 8081, false));
		return Flux.just(instances);
	}

}
