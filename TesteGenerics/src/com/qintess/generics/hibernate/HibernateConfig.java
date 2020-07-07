package com.qintess.generics.hibernate;


	

	import java.util.Properties;

	import org.hibernate.SessionFactory;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.cfg.Environment;
	import org.hibernate.service.ServiceRegistry;

import com.qintess.generics.modelo.Carro;
import com.qintess.generics.modelo.Pessoa;




	public class HibernateConfig {
		
		//respons�vel por fazer a sess�o com o hibernate
		//fazer toda a parte de configura��o
		private static SessionFactory sessionFactory;
		
		//m�todo
		public static SessionFactory getSessionFactory() {
			
			if(sessionFactory == null) {
				
				try {
					
					Configuration configuration = new Configuration ();
					
					//funciona como hash map, chaves e valores
					Properties  prop = new Properties();
					
					//configura��o de conex�o ao banco de dadoa
					prop.put(Environment.DRIVER,"org.h2.Driver");
					prop.put(Environment.URL, "jdbc:h2:~/db~bd_entidade");
					prop.put(Environment.USER, "sa");
					prop.put(Environment.PASS, "");
					prop.put(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");// o DIALECT, passa particulares no sql
					
					//mostra as execu��es de sql no console
					prop.put(Environment.SHOW_SQL,"true");
					
					//a cada vez que for criado uma banco sera criado e dropado, usado em ambiente de teste
					prop.put(Environment.HBM2DDL_AUTO,"create-drop");
					
					//pegar as propriedades e coloca nas configura��es
					configuration.setProperties(prop);
					
					//parte chata
					//esse addAnnotatedClass vai  ser cada uma das entidades queexiste no banco de dados
					//vai ter que passar todas as entidades pra mapear no java
					//passa a classe anotada - todas as condigura��es ser
					configuration.addAnnotatedClass(Pessoa.class);
					configuration.addAnnotatedClass(Carro.class);
					//configuration.addAnnotatedClass(ItemVenda.class);
					
					//registro do servi�o do hibernate
					ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
														.applySettings(configuration.getProperties())
														.build();
					
					sessionFactory = configuration.buildSessionFactory(serviceRegistry);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			return sessionFactory;
			
		}

	


}


