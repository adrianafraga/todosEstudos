package com.qintess.ingressos.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Essa classe ser� inicializada automaticamente pelo spring efetuar� todas as configura��es necess�rias
//N�s temos que escrever as configura��es manualmente

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {// esse m�todo configura componentes externos (ex: hibernate)
		return new Class [] { //array iniciado de forma r�pida
				HibernateConfig.class
		};
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {// esse m�todo configura  o mvc do spring
		return null;
		
	}

	@Override
	protected String[] getServletMappings() {// esse m�todo configura  o mapeamento servlet do spring
		return null;
	}
	
	

}
