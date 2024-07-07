package com.rh.folha.service;

import org.springframework.stereotype.Service;

import com.rh.folha.entity.Pagamento;

@Service
public class PagamentoService {

	public Pagamento getPagamentos(long idFuncionario, int dias) {
		return new Pagamento("A", 20.0, 10);
	}
	
}
