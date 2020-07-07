package com.qintess.banco.modelo;

public  abstract class Conta {
	
	
	// declaração das variáveis
	private int agencia;
	private int numero;
	private int digito;
	protected double saldo;
	private Cliente cliente;
	
	
	public Conta (Cliente cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	
	




	public abstract void deposita (double valor);
	
	public abstract void saca (double valor);
	
	public abstract void  transfere (double valor, Conta conta);

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
