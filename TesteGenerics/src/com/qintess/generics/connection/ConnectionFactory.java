package com.qintess.generics.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


//classe que estabelece a conexão com o banco de dados
//atributo fac será utilizado como modificador non-access static, sendo único para toda a instância
public class ConnectionFactory {
	
	private static EntityManagerFactory fac = Persistence.createEntityManagerFactory("dao-generico");;
	
	public static EntityManager getEntityManager() {
		return fac.createEntityManager();
	}

}
