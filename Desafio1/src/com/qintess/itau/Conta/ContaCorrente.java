package com.qintess.itau.Conta;

public class ContaCorrente extends Conta {
	

	
		//porque ele n�o deixa criar esse construtor pelo modo autom�tico source -> generater constructor from superclasse ???
		// tive que digitar
		public ContaCorrente(String agencia, String numero, double saldo, Cliente cliente) {
		super(); //representa a instancia da conta dentro da conta corrente
		
	}



	public double valorTaxa;
	
			public ContaCorrente (double valorTaxa) {
			this.valorTaxa = valorTaxa;
		}


	
	
}
