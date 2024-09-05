package com.rh.rhfuncionario.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
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
	
	private final static Logger logger = LoggerFactory.getLogger(FuncionarioResource.class);
	private final FuncionarioRepository funcionarioRepository;
	private final Environment env;
	
	@Value("${test.config}")
	private String testConfig;

	public FuncionarioResource(FuncionarioRepository funcionarioRepository, Environment env) {
		this.funcionarioRepository = funcionarioRepository;
		this.env = env;
	}
	
	@GetMapping("/configs")
	public ResponseEntity<Void> configs() {
		logger.info("Config: "+testConfig);
		return ResponseEntity.noContent().build();
	}

	@GetMapping
	public ResponseEntity<List<Funcionario>> buscarTodos() {
		var funcionarios = funcionarioRepository.findAll();
		return ResponseEntity.ok(funcionarios);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Funcionario> buscarPorId(@PathVariable Long id) {
		
		logger.info("porta: "+env.getProperty("local.server.port"));
		
		var funcionario = funcionarioRepository.findById(id);
		return funcionario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

}
