package com.qintess.hibernate.generics.dao;

import com.qintess.hibernate.generics.base.EntBase;
import com.qintess.hibernate.generics.config.HibernateConfig;
import com.qintess.hibernate.generics.model.Produto;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class GenericDao <T extends EntBase > {
	
	

	
	//selecionando por ID
	public T buscaPorId (Class<T> clazz, Long id) {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = null;

        return session.find(clazz, id);
    }
	
	//salvar e atualizar
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
	

	//deletando
	public void apagar (Class<T> clazz, Long id) {
		Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(this.buscaPorId(clazz, id));
            session.getTransaction().commit();
            System.out.println("Sucesso ao deletar produto !!!");

        }catch (Exception e) {
        	System.out.println("Falha ao deletar produto !!!");
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        } finally {
            session.close();
        }
    }
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
