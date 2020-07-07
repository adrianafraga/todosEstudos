package com.qintess.estudo.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.qintess.estudo.hibernate.config.HibernateConfig;
import com.qintess.estudo.hibernate.model.Produto;
import com.qintess.estudo.hibernate.model.Venda;

public class VendaDao {
	
public void salva(Venda venda) {
		
		Transaction transacao = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			transacao = session.beginTransaction();
			
			session.save(venda);
			
			transacao.commit();
			
		} catch (Exception e) {
			
			if(transacao != null) {
				transacao.rollback();
			}
			
			e.printStackTrace();
		}
			
	}
	
	
	public void atualiza (Venda venda) {
		
		Transaction transacao = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			transacao = session.beginTransaction();
			
			session.merge(venda);
			
			transacao.commit();
			
		} catch (Exception e) {
			
			if(transacao != null) {
				transacao.rollback();
			}
			
			e.printStackTrace();
		}
			
	}
	
	public void remove (Venda venda) {
		
		Transaction transacao = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			transacao = session.beginTransaction();
			
			session.remove(venda);
		
			
			transacao.commit();
			
		} catch (Exception e) {
			
			if(transacao != null) {
				transacao.rollback();
			}
			
			e.printStackTrace();
		}
			
	}

	
	public Venda buscaPorId(int id){
	
	try(Session session  = HibernateConfig.getSessionFactory().openSession()){
		//fazendo select sem where
		return session.find(Venda.class, id);
	}
	catch (Exception e) {
		e.printStackTrace();
		return null;
		}
	}

	//lista Produto todos que foram criados na tabela
	public List<Venda> buscaTodos(){
		
		try(Session session  = HibernateConfig.getSessionFactory().openSession()){
			//fazendo select sem where
			return session.createQuery("from Venda", Venda.class).list();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
