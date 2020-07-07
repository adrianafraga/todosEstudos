package com.qintess.itau.Conta;

public class ContaPoupanca extends Conta {

	//porque ele não deixa criar esse construtor pelo modo automático source -> generater constructor from superclasse ???
	// tive que digitar
	public ContaPoupanca(String agencia, String numero, double saldo, Cliente cliente) {
		super();
		
	}
}
	
