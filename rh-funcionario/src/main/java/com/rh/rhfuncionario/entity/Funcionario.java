package com.rh.rhfuncionario.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double rendimentoDiario;

	public Funcionario() {

	}

	public Funcionario(Long id, String nome, Double rendimentoDiario) {
		super();
		this.id = id;
		this.nome = nome;
		this.rendimentoDiario = rendimentoDiario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendimentoDiario() {
		return rendimentoDiario;
	}

	public void setRendimentoDiario(Double rendimentoDiario) {
		this.rendimentoDiario = rendimentoDiario;
	}

}
