package com.qintess.itau.ExecutaConta;

import com.qintess.itau.Conta.Cliente;
import com.qintess.itau.Conta.Conta;

public class Executa_Conta {
	
	//metodo
	//pedi vesibilidade private, public
	// void - retorno (objeto)
	// main - nome do metodo, passe parametros no momento da execu��o
	//ver se tem paramentros ou n�o
	//static -> n�o precisa passar pela instancia para executar esse m�todo
	public static void main(String[] args) {

		/*Conta contaCliente = new Conta();
		contaCliente.setAgencia("200");
		System.out.println(contaCliente.getAgencia());*/
		
//			Cliente cli = new Cliente();
		
			Conta contaCliente = new Conta ();
			contaCliente.setSaldo (100.00);
			
			
			Conta contaConta = new Conta();
			contaConta.setSaldo(200);
			contaCliente.transferir(300, contaConta);
			
			
			
		
			
			
	}

}
