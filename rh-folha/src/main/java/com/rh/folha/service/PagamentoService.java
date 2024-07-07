package com.rh.folha.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rh.folha.entity.Funcionario;
import com.rh.folha.entity.Pagamento;

@Service
public class PagamentoService {

	@Value("${hr-func.host}") 
	private String host;
	
	private final RestTemplate restTemplate;

	public PagamentoService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public Pagamento getPagamentos(long idFuncionario, int dias) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", String.valueOf(idFuncionario));
		
		var func = restTemplate.getForObject(host + "/funcionario/{id}", Funcionario.class, uriVariables);
		return new Pagamento(func.getNome(), func.getRendimentoDiario(), dias);
	}

}
