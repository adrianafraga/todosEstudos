package com.qintess.ingressos.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement	
public class HibernateConfig {
		
		@Bean //método que será invoado pelo spring de forma automática
		public LocalSessionFactoryBean sessionFactory() {
			LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
			sessionFactory.setDataSource(dataSource());
			sessionFactory.setPackagesToScan("com.qintess.ingressos.model");//spring  lida com pacotes e não classes para fazer o scan de entidades do hibernate
			sessionFactory.setHibernateProperties(hibernateProperties());
			
			return sessionFactory;
			
		}
		
		@Bean	
		public DataSource dataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("org.h2.Driver");
			dataSource.setUrl("jdbc:h2:~/db~bdIngressos");
			
			//os dados user e pass precisam ser os definidos na instalação do mysql
			dataSource.setUsername("sa");
			dataSource.setPassword("");
			
			return dataSource;
			
		}
		
		@Bean
		public HibernateTransactionManager getTransactionManager() {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager();
			transactionManager.setSessionFactory(sessionFactory().getObject());
			
			return transactionManager;
			
		}
		
		private final Properties hibernateProperties() {
			Properties hibernateProperties = new Properties ();
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
			hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			hibernateProperties.setProperty("hibernate.show_sql","true");
			hibernateProperties.setProperty("hibernate.jdbc.time_zone", "UTC");
			
			return hibernateProperties;
			
			
		}
}
