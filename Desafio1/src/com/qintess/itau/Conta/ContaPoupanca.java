package com.qintess.itau.Conta;

public class ContaPoupanca extends Conta {

	//porque ele n�o deixa criar esse construtor pelo modo autom�tico source -> generater constructor from superclasse ???
	// tive que digitar
	public ContaPoupanca(String agencia, String numero, double saldo, Cliente cliente) {
		super();
		
	}
}
	
