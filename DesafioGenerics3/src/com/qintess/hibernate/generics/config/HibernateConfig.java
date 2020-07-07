package com.qintess.hibernate.generics.config;


import com.qintess.hibernate.generics.modelo.Cerveja;
import com.qintess.hibernate.generics.modelo.Cidade;
import com.qintess.hibernate.generics.modelo.Cliente;
import com.qintess.hibernate.generics.modelo.Estado;
import com.qintess.hibernate.generics.modelo.Estilo;
import com.qintess.hibernate.generics.modelo.Grupo;
import com.qintess.hibernate.generics.modelo.GrupoPermissao;
import com.qintess.hibernate.generics.modelo.ItemVenda;
import com.qintess.hibernate.generics.modelo.Permissao;
import com.qintess.hibernate.generics.modelo.Usuario;
import com.qintess.hibernate.generics.modelo.UsuarioGrupo;
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
					
					//configuração de conexão ao banco de dadoa
					prop.put(Environment.DRIVER,"org.h2.Driver");
					prop.put(Environment.URL, "jdbc:h2:~/db~generic_hibernate3");
					prop.put(Environment.USER, "sa");
					prop.put(Environment.PASS, "");
					prop.put(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");// o DIALECT, passa particulares no sql
					
					//mostra as execuções de sql no console
					prop.put(Environment.SHOW_SQL,"true");
					
					//a cada vez que for criado uma banco sera criado e dropado, usado em ambiente de teste
					prop.put(Environment.HBM2DDL_AUTO,"update");
					
					
					configuration.setProperties(prop);
					configuration.addAnnotatedClass(Cerveja.class);
					configuration.addAnnotatedClass(Cidade.class);
					configuration.addAnnotatedClass(Cliente.class);
					configuration.addAnnotatedClass(Estado.class);
					configuration.addAnnotatedClass(Estilo.class);
					configuration.addAnnotatedClass(Grupo.class);
					//configuration.addAnnotatedClass(GrupoPermissao.class);
					configuration.addAnnotatedClass(ItemVenda.class);
					configuration.addAnnotatedClass(Permissao.class);
					configuration.addAnnotatedClass(Usuario.class);
					//configuration.addAnnotatedClass(UsuarioGrupo.class);
					configuration.addAnnotatedClass(Venda.class);
		
					
					//registro do serviço do hibernate
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

