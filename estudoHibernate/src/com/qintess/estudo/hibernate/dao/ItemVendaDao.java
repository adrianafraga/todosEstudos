package com.qintess.estudo.hibernate.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.qintess.estudo.hibernate.config.HibernateConfig;
import com.qintess.estudo.hibernate.model.ItemVenda;
import com.qintess.estudo.hibernate.model.Produto;


public class ItemVendaDao {

public void salva(ItemVenda itemvenda) {
		
		Transaction transacao = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			transacao = session.beginTransaction();
			
			session.save(itemvenda);
			
			transacao.commit();
			
		} catch (Exception e) {
			
			if(transacao != null) {
				transacao.rollback();
			}
			
			e.printStackTrace();
		}
			
	}
	
	
	public void atualiza (ItemVenda itemvenda) {
		
		Transaction transacao = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			transacao = session.beginTransaction();
			
			session.merge(itemvenda);
			
			transacao.commit();
			
		} catch (Exception e) {
			
			if(transacao != null) {
				transacao.rollback();
			}
			
			e.printStackTrace();
		}
			
	}
	
	public void remove (ItemVenda itemvenda) {
		
		Transaction transacao = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			transacao = session.beginTransaction();
			
			session.remove(itemvenda);
		
			
			transacao.commit();
			
		} catch (Exception e) {
			
			if(transacao != null) {
				transacao.rollback();
			}
			
			e.printStackTrace();
		}
			
	}

	
	public ItemVenda buscaPorId(int id){
	
	try(Session session  = HibernateConfig.getSessionFactory().openSession()){
		//fazendo select sem where
		return session.find(ItemVenda.class, id);
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
			return session.createQuery("from ItemVenda", Produto.class).list();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
