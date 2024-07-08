package com.rh.folha.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rh.folha.entity.Funcionario;

@Component
@FeignClient(name = "rh-funcionario", path = "/funcionario", fallback = FuncionarioFeignClientFallback.class)
public interface FuncionarioFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Funcionario> buscarPorId(@PathVariable Long id);

}


