package com.rh.rhfuncionario.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rh.rhfuncionario.entity.Funcionario;
import com.rh.rhfuncionario.repository.FuncionarioRepository;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioResource {

	private FuncionarioRepository funcionarioRepository;

	public FuncionarioResource(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}

	@GetMapping
	public ResponseEntity<List<Funcionario>> buscarTodos() {
		var funcionarios = funcionarioRepository.findAll();
		return ResponseEntity.ok(funcionarios);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Funcionario> buscarPorId(@PathVariable Long id) {
		var funcionario = funcionarioRepository.findById(id);
		return funcionario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

}
