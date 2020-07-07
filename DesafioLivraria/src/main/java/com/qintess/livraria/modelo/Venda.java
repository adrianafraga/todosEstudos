package com.qintess.livraria.modelo;

public class Venda {
	
	private int idvenda;
	private String data;
	private float total;
	private int idcliente;
	
	
	public Venda(int idvenda, String data, float total, int idcliente) {
		super();
		this.idvenda = idvenda;
		this.data = data;
		this.total = total;
		this.idcliente = idcliente;
	}


	private int getIdvenda() {
		return idvenda;
	}


	private void setIdvenda(int idvenda) {
		this.idvenda = idvenda;
	}


	private String getData() {
		return data;
	}


	private void setData(String data) {
		this.data = data;
	}


	private float getTotal() {
		return total;
	}


	private void setTotal(float total) {
		this.total = total;
	}


	private int getIdcliente() {
		return idcliente;
	}


	private void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	
	

}
