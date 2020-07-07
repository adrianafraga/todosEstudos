package com.qintess.generics.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_pessoa")
public class Pessoa implements EntidadeBase {
	
	private Long id;
	private String nome;
	private int idade;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name="nome")
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Column(name="idade")
	public int getIdade() {
		return idade;
	}

	
	
	
	



}
