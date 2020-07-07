package com.qintess.banco.modelo;

public class ContaCorrente extends Conta {

	
	
	public double valorTaxa;
	
	
	
	/**
	 * @param cliente
	 * @param saldo
	 * @param valorTaxa
	 */
	public ContaCorrente(Cliente cliente, double saldo, double valorTaxa) {
		super(cliente, saldo);
		this.valorTaxa = valorTaxa;
	}

	
	
	
	

	


	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	@Override
	public void deposita(double valor) {
		saldo += valor;
		System.out.println("Seu saldo atual é " + saldo);
			
	}

	@Override
	public void saca(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfere(double valor, Conta conta) {
		// TODO Auto-generated method stub
		
	}

}


