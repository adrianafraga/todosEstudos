package com.qintess.ingressos.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Essa classe será inicializada automaticamente pelo spring efetuará todas as configurações necessárias
//Nós temos que escrever as configurações manualmente

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {// esse método configura componentes externos (ex: hibernate)
		return new Class [] { //array iniciado de forma rápida
				HibernateConfig.class
		};
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {// esse método configura  o mvc do spring
		return null;
		
	}

	@Override
	protected String[] getServletMappings() {// esse método configura  o mapeamento servlet do spring
		return null;
	}
	
	

}
