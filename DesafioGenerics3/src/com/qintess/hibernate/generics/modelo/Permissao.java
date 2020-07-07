package com.qintess.hibernate.generics.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.qintess.hibernate.generics.base.EntidadeBase;

@Entity
public class Permissao implements EntidadeBase {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
