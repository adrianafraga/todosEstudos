package com.qintess.hibernate.generics;

import com.qintess.hibernate.generics.modelo.Produto;
import com.qintess.hibernate.generics.modelo.ItemVenda;
import com.qintess.hibernate.generics.modelo.Venda;
	
	

	import java.util.Properties;

	import org.hibernate.SessionFactory;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.cfg.Environment;
	import org.hibernate.service.ServiceRegistry;




	public class HibernateConfig {
		
		
		private static SessionFactory sessionFactory;
		
	
		public static SessionFactory getSessionFactory() {
			
			if(sessionFactory == null) {
				
				try {
					
					Configuration configuration = new Configuration ();
					
					//funciona como hash map, chaves e valores
					Properties  prop = new Properties();
					
					//configura��o de conex�o ao banco de dadoa
					prop.put(Environment.DRIVER,"org.h2.Driver");
					prop.put(Environment.URL, "jdbc:h2:~/db~generic_hibernate");
					prop.put(Environment.USER, "sa");
					prop.put(Environment.PASS, "");
					prop.put(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");// o DIALECT, passa particulares no sql
					
					//mostra as execu��es de sql no console
					prop.put(Environment.SHOW_SQL,"true");
					
					//a cada vez que for criado uma banco sera criado e dropado, usado em ambiente de teste
					prop.put(Environment.HBM2DDL_AUTO,"update");
					
					//pegar as propriedades e coloca nas configura��es
					configuration.setProperties(prop);
					
					//parte chata
					//esse addAnnotatedClass vai  ser cada uma das entidades queexiste no banco de dados
					//vai ter que passar todas as entidades pra mapear no java
					//passa a classe anotada - todas as condigura��es ser
					configuration.addAnnotatedClass(Produto.class);
					configuration.addAnnotatedClass(Venda.class);
					configuration.addAnnotatedClass(ItemVenda.class);
					
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
