package com.qintess.livraria.modelo;
import com.qintess.livraria.conexao.conecta;



public class ItensVendas {
 
	private int iditensvenda;
	private int quantidade;
	private double subtotal;
	private int estoque;
	private int idvenda;
	private int idlivro;
	
	public ItensVendas(int iditensvenda, int quantidade, double subtotal, int estoque, int idvenda, int idlivro) {
		this.iditensvenda = iditensvenda;
		this.quantidade = quantidade;
		this.subtotal = subtotal;
		this.estoque = estoque;
		this.idvenda = idvenda;
		this.idlivro = idlivro;
	}
	private int getIditensvenda() {
		return iditensvenda;
	}
	private void setIditensvenda(int iditensvenda) {
		this.iditensvenda = iditensvenda;
	}
	private int getQuantidade() {
		return quantidade;
	}
	private void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	private double getSubtotal() {
		return subtotal;
	}
	private void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	private int getEstoque() {
		return estoque;
	}
	private void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	private int getIdvenda() {
		return idvenda;
	}
	private void setIdvenda(int idvenda) {
		this.idvenda = idvenda;
	}
	private int getIdlivro() {
		return idlivro;
	}
	private void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}
	
	
	
	
}