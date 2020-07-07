package com.qintess.hibernate.generics.dao;

import com.qintess.hibernate.generics.HibernateConfig;
import com.qintess.hibernate.generics.modelo.*;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class GenericDao <T extends EntidadeBase> {
	
	
	//leitura
	public T localizar (Class<T> clazz, Long id)  {
		
		Session sessao = HibernateConfig.getSessionFactory().openSession();
		Transaction transacao = null;
		return sessao.find(clazz, id);
		
			
	}
	
	//salvar e update
	public void salvar (T obj)  {
		
		Session sessao = HibernateConfig.getSessionFactory().openSession();
		Transaction transacao = null;
		
		try {
			transacao = sessao.beginTransaction();
			sessao.save(obj);
			transacao.commit();			
			} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
			}
			finally {
				sessao.close();
		}
	}	
	

	//deletar
	public void deletar (Class <T> clazz, Long id) {
		
		
		Session sessao = HibernateConfig.getSessionFactory().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.remove(id);
			transacao.commit();			
			} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
			}
			finally {
				sessao.close();
		}		

	}
}


	
	

