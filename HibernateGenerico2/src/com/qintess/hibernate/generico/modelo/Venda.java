package com.qintess.hibernate.generico.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.qintess.hibernate.generico.base.EntidadeBase;

public class Venda implements EntidadeBase {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Cliente cliente;
	
	private int desconto;
	
	private String forma_pagamento;
	
	

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
