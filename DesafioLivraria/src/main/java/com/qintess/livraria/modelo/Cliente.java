package com.qintess.livraria.modelo;

public class Cliente {
	
	private int id;
	private String nome;
	private String telefone;

	
	public Cliente(int id, String nome, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getTelefone() {
		return telefone;
	}
	private void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
