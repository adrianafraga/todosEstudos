package com.qintess.hibernate.generics.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.qintess.hibernate.generics.base.EntidadeBase;


@Entity
public class Estilo implements EntidadeBase {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (length = 200, nullable = false)
	private String nome;
	
	
	

	@Override
	public String toString() {
		return "Estilo [id=" + id + ", nome=" + nome + "]";
	}


	public Long getId() {
		return (Long) id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setId(Long id) {
		this.id = id;
	}

	
	
}
