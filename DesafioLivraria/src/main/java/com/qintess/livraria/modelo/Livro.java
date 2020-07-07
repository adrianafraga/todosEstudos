package com.qintess.livraria.modelo;

public class Livro {

	private int idlivro;
	private String titulo;
	private float preco;
	private int estoque;
	private Genero genero;

	
	
	public Livro(int idlivro, String titulo, float preco, int estoque, com.qintess.livraria.modelo.Genero genero) {
		this.idlivro = idlivro;
		this.titulo = titulo;
		this.preco = preco;
		this.estoque = estoque;
		this.genero = genero;
	}
	
	private int getIdlivro() {
		return idlivro;
	}
	private void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}
	private String getTitulo() {
		return titulo;
	}
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	private float getPreco() {
		return preco;
	}
	private void setPreco(float preco) {
		this.preco = preco;
	}
	private int getEstoque() {
		return estoque;
	}
	private void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	private Genero getGenero() {
		return genero;
	}
	private void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
}
