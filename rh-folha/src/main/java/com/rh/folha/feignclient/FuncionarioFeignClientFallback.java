package com.rh.folha.feignclient;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.rh.folha.entity.Funcionario;

@Component
public class FuncionarioFeignClientFallback implements FuncionarioFeignClient {

	@Override
	public ResponseEntity<Funcionario> buscarPorId(Long id) {
		var func = new Funcionario(id, "Erro", 20.0);
		return ResponseEntity.ok(func);
	}
}

