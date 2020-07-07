package com.qintess.itau.Conta;

public class Conta {
	
	private String agencia;
	private String numero;
	private double saldo;
	private Cliente cliente; // criação do atributo para ligar as classes
	private double chequeEspecial = 300.00;
	private double limite;
	private double saque;
	private double taxaSaque = 0.30;
	private double taxaLimite = 2.00;	
	private double taxaTransferencia = 4.00;
	
	

		
	
	
	// construtores não default
	//
	public Conta(String agencia, String numero, double saldo, Cliente cliente, double chequeEspecial) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.chequeEspecial = chequeEspecial;
		
	
	}
	public Conta() {
		
	}

	
	//
	
	
	
	//métodos get /sets para encapsular atributos
	
	
	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
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


	public double getChequeEspecial() {
		return chequeEspecial;
	}


	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}


	public double getSaque() {
		return saque;
	}


	public void setSaque(double saque) {
		this.saque = saque;
	}


	public double getTaxaLimite() {
		return taxaLimite;
	}


	public void setTaxaLimite(double taxaLimite) {
		this.taxaLimite = taxaLimite;
	}


	public double getTaxaSaque() {
		return taxaSaque;
	}
	


	public void setTaxaSaque(double taxaSaque) {
		this.taxaSaque = taxaSaque;
	}
	
//	public void setConta(Conta conta) {
//		this.conta = conta;
//	}
	
	public double getTaxaTranferencia() {
		return taxaTransferencia;
	}


	public void setTaxaTransferencia(double saque) {
		this.taxaTransferencia = taxaTransferencia;
	}

	
	//método deposita
			public void depositar (double valor) {		
				saldo += valor;
				System.out.println("Seu saldo atual é " + saldo);
			}

			//método transfere
			
			public boolean transferir (double valor, Conta dest) {
				if (valor <= (saldo + taxaTransferencia ) ) {
					dest.depositar(valor);
					System.out.println("Transferência realizada");
					return true;
				}
				else {
					System.out.println("Saldo insuficiente");
					return false;
				}
				
				
				}
			
		
	//método saque
	public boolean sacar (double valorSaque) {
		
		
		if(valorSaque <= saldo) {
			saldo -= valorSaque;
			saldo -= taxaSaque;
			System.out.println("Seu saldo atual é " + saldo );
			return true;

		}
		else if ( (saldo + chequeEspecial ) >= valorSaque + taxaLimite ) {
			saldo = saldo + chequeEspecial;
			saldo -= valorSaque -(taxaSaque + taxaLimite);
			System.out.println("Você entrou no cheque especial");
			System.out.println (" Você sacou:" + saldo);
			return true;
		}
		
		else	{
			System.out.println("Saldo insuficiente");
			return false;

		}
		
		
		
		
		
	

		
	}

}
	
	