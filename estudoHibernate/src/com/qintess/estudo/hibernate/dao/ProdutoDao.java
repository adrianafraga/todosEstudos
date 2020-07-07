package com.qintess.estudo.hibernate.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qintess.estudo.hibernate.config.HibernateConfig;
import com.qintess.estudo.hibernate.model.Produto;

public class ProdutoDao {
	
	public void salva(Produto produto) {
		
		Transaction transacao = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			transacao = session.beginTransaction();
			
			session.save(produto);
			
			transacao.commit();
			
		} catch (Exception e) {
			
			if(transacao != null) {
				transacao.rollback();
			}
			
			e.printStackTrace();
		}
			
	}
	
	
	public void atualiza (Produto produto) {
		
		Transaction transacao = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			transacao = session.beginTransaction();
			
			session.merge(produto);
			
			transacao.commit();
			
		} catch (Exception e) {
			
			if(transacao != null) {
				transacao.rollback();
			}
			
			e.printStackTrace();
		}
			
	}
	
	public void remove (Produto produto) {
		
		Transaction transacao = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			transacao = session.beginTransaction();
			
			session.remove(produto);
		
			
			transacao.commit();
			
		} catch (Exception e) {
			
			if(transacao != null) {
				transacao.rollback();
			}
			
			e.printStackTrace();
		}
			
	}

	
	public Produto buscaPorId(int id){
	
	try(Session session  = HibernateConfig.getSessionFactory().openSession()){
		//fazendo select sem where
		return session.find(Produto.class, id);
	}
	catch (Exception e) {
		e.printStackTrace();
		return null;
		}
	}

	//lista Produto todos que foram criados na tabela
	public List<Produto> buscaTodos(){
		
		try(Session session  = HibernateConfig.getSessionFactory().openSession()){
			//fazendo select sem where
			return session.createQuery("from Produto", Produto.class).list();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
