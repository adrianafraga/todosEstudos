package com.qintess.hibernate.generics.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qintess.hibernate.generics.base.EntidadeBase;
import com.qintess.hibernate.generics.config.HibernateConfig;



public class GenericaDao <T extends EntidadeBase> {
	
	
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

