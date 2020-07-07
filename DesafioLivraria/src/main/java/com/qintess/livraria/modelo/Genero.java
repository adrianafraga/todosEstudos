package com.qintess.livraria.modelo;

public class Genero {
	
	private int idgenero;
	private String descricao;
	
	
	public Genero(int idgenero, String descricao) {
		super();
		this.idgenero = idgenero;
		this.descricao = descricao;
	}
	
	private int getIdgenero() {
		return idgenero;
	}
	private void setIdgenero(int idgenero) {
		this.idgenero = idgenero;
	}
	private String getDescricao() {
		return descricao;
	}
	private void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
