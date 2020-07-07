package com.qintess.ingressos.config;

	import javax.servlet.Filter;

	import org.springframework.web.filter.CharacterEncodingFilter;
	import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

	//Essa classe ser� inicializada automaticamente pelo spring e efetuar� todas as configura��es necess�rias
	//N�s temos que escrever as configura��es manualmente
	public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

		@Override
		protected Class<?>[] getRootConfigClasses() { //esse m�todo configura componentes externos (ex: hibernate)
			return new Class[] {
					
					HibernateConfig.class
					
			};
		}

		@Override
		protected Class<?>[] getServletConfigClasses() { //esse m�todo configura o mvc do spring
			return new Class[] {
					
					WebMvcConfig.class
				
			};
		}

		@Override
		protected String[] getServletMappings() { // esse m�todo configura o mapeamento do servlet do spring
			return new String[] {
				"/"	
			};
		}
}
