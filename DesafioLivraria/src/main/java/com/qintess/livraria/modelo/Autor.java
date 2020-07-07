package com.qintess.livraria.modelo;

public class Autor {
	
	private int idautor;
	private String nome;
	private String email;
	
	public Autor(int idautor, String nome, String email) {
		super();
		this.idautor = idautor;
		this.nome = nome;
		this.email = email;
	}

	private int getIdautor() {
		return idautor;
	}

	private void setIdautor(int idautor) {
		this.idautor = idautor;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
