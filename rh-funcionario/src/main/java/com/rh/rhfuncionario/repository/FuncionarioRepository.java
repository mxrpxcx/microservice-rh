package com.rh.rhfuncionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rh.rhfuncionario.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	
	
}
