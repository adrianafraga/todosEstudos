package com.qintess.estudo.hibernate;

import com.qintess.estudo.hibernate.dao.ItemVendaDao;
import com.qintess.estudo.hibernate.dao.ProdutoDao;
import com.qintess.estudo.hibernate.model.ItemVenda;
import com.qintess.estudo.hibernate.model.Produto;
import com.qintess.estudo.hibernate.model.Venda;
import com.qintess.estudo.hibernate.dao.VendaDao;


public class App {
	public static void main (String []args) {
		
		ProdutoDao dao = new ProdutoDao();
		Produto prod = new Produto("S9", 3500);
		Produto prod2 = new Produto("S8", 1900);
		dao.salva(prod);
		dao.salva(prod2);
		
		VendaDao vdao = new VendaDao ();
		Venda venda = new Venda();
		venda.setTotal(7300);
		vdao.salva(venda);
		//salvar venda
		
		ItemVendaDao ivdao = new ItemVendaDao();
		ItemVenda itvenda = new ItemVenda();
		ItemVenda itvenda1 = new ItemVenda ();
		itvenda.setQtd(1);
		itvenda.setSubtotal(3500);
		itvenda.setProduto(prod);
		itvenda.setVenda(venda);
		ivdao.salva(itvenda);
		itvenda1.setQtd(2);
		itvenda1.setSubtotal(1900);
		itvenda1.setProduto(prod2);
		itvenda1.setVenda(venda);
		ivdao.salva(itvenda1);
		
		
			
	}
}
	
	
