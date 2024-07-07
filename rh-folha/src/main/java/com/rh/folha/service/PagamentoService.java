package com.rh.folha.service;

import org.springframework.stereotype.Service;

import com.rh.folha.entity.Pagamento;
import com.rh.folha.feignclient.FuncionarioFeignClient;

@Service
public class PagamentoService {

	private final FuncionarioFeignClient funcionarioFeignClient;

	public PagamentoService(FuncionarioFeignClient funcionarioFeignClient) {
		this.funcionarioFeignClient = funcionarioFeignClient;
	}

	public Pagamento getPagamentos(long idFuncionario, int dias) {
		var func = funcionarioFeignClient.buscarPorId(idFuncionario).getBody();
		return new Pagamento(func.getNome(), func.getRendimentoDiario(), dias);
	}

}
