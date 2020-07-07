package com.qintess.generics.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


//classe que estabelece a conex�o com o banco de dados
//atributo fac ser� utilizado como modificador non-access static, sendo �nico para toda a inst�ncia
public class ConnectionFactory {
	
	private static EntityManagerFactory fac = Persistence.createEntityManagerFactory("dao-generico");;
	
	public static EntityManager getEntityManager() {
		return fac.createEntityManager();
	}

}
