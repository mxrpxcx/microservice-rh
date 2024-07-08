package com.rh.folha.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rh.folha.entity.Pagamento;
import com.rh.folha.service.PagamentoService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoResource {

	private PagamentoService pagamentoService;
	
	public PagamentoResource(PagamentoService pagamentoService) {
		this.pagamentoService = pagamentoService;
	}
	
	@GetMapping(value = "/{idFuncionario}/dias/{dias}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable Long idFuncionario, @PathVariable Integer dias) {
		var pagamento = pagamentoService.getPagamentos(idFuncionario, dias);
		return ResponseEntity.ok(pagamento);
	}
	
}
