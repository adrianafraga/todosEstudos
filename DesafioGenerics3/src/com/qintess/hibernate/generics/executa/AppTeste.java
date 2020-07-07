package com.qintess.hibernate.generics.executa;

import com.qintess.hibernate.generics.dao.GenericaDao;
import com.qintess.hibernate.generics.modelo.Cidade;
import com.qintess.hibernate.generics.modelo.Estado;
import com.qintess.hibernate.generics.modelo.Venda;

public class AppTeste {

	public static void main(String[] args) {
		
		Venda venda = new Venda ();
		GenericaDao<Venda> gDaoVen = new GenericaDao<Venda>();
		
		Cidade cidade = new Cidade();
		GenericaDao<Cidade> gDaoCid = new GenericaDao<Cidade>();
		
		Estado estado = new Estado ();
		GenericaDao<Estado> gDaoEst = new GenericaDao<Estado>();
		
		estado.setNome("São Paulo");
		estado.setSigla("SP");
		gDaoEst.salvar(estado);
		
		cidade.setNome("São Paulo");
		gDaoCid.salvar(cidade);
		
				
		
		System.out.println("Estado inserido com sucesso!!");
		System.out.println("Cidade inserida com sucesso!!");
		
		
		
		
		
		
	
	}
}
