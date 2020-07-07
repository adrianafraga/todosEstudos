package com.qintess.livraria.modelo;

public class Escreve {
	
	private int idlivro;
	private int idautor;
	
	
	public Escreve(int idlivro, int idautor) {
		this.idlivro = idlivro;
		this.idautor = idautor;
	}
	
	
	private int getIdlivro() {
		return idlivro;
	}
	private void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}
	private int getIdautor() {
		return idautor;
	}
	private void setIdautor(int idautor) {
		this.idautor = idautor;
	}
	
	
}
