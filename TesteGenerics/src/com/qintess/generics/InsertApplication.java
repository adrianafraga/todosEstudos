package com.qintess.generics;

import com.qintess.generics.dao.DaoGenerico;
import com.qintess.generics.modelo.Carro;
import com.qintess.generics.modelo.Pessoa;

public class InsertApplication {
	
	public static void main(String[]args) {
		
		Pessoa pessoa = new Pessoa();
		Carro carro =  new Carro();
		
		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();
		DaoGenerico<Carro> daoCarro = new DaoGenerico<Carro>();
		
		pessoa.setNome("Kalla Fraga");
		pessoa.setIdade(2);
		
		carro.setModelo("Camaro");
		carro.setAnoFabricacao(2020);
		
		daoPessoa.saveOrUpdate(pessoa);
		daoCarro.saveOrUpdate(carro);
		
		System.out.println("Entidades salvas com sucesso!!!");
	}

}
