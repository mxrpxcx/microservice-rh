package com.rh.folha.entity;

import java.io.Serializable;

public class Pagamento implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private Double rendimentoDiario;
	private Integer diasTrabalhados;

	public Pagamento() {

	}

	public Pagamento(String nome, Double rendimentoDiario, Integer diasTrabalhados) {
		super();
		this.nome = nome;
		this.rendimentoDiario = rendimentoDiario;
		this.diasTrabalhados = diasTrabalhados;
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

	public Integer getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(Integer diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public Double getTotal() {
		return this.diasTrabalhados * this.rendimentoDiario;
	}

}
