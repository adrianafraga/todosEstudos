package com.qintess.estudo.hibernate.model;

import com.qintess.estudo.hibernate.dao.*;

import com.qintess.estudo.hibernate.App;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// aqui nessa classe ser� feito algumas anota��es, pois ela sera adicionada na configuration.addAnnotatedClass(Produto.class);
// ser� feito anota��es nessa classe
//entidade do hibernate, a classe anotada ser� uma c�pia da tabela de banco de dados
//objeto produto � uma c�pia da tabela do banco de dados

@Entity
public class Produto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (length = 200, nullable = false)
	private String nome;
	
	@Column (nullable = false)
	private double preco;


	
	//tem que ter o contrutor default, que � utilizado na parte de reflexion
	public Produto () {}
	
	
	public Produto( String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}


	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
