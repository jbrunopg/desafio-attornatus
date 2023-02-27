package br.com.gerenciamento.pessoas.desafiovagaattornatus.model;

import java.time.LocalDate;


public class gp {
	
	private String nome;
	private LocalDate idade;
	private String endereço;
	
	public gp(String nome, LocalDate idade, String endereço) {
		this.nome = nome;
		this.idade = idade;
		this.endereço = endereço;
	}
	@SuppressWarnings("unused")
	private gp() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getIdade() {
		return idade;
	}
	
	public void setIdade(LocalDate idade) {
		this.idade = idade;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

}
