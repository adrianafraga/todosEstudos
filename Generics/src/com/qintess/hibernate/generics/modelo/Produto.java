package com.qintess.hibernate.generics.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // anotação para mapear a tabela do banco de dados através da classe 
@Table (name="venda") //definindo nome da tabela que está sendo mapeada
public class Produto  implements EntidadeBase {

	@Id //mapeando o campo id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// definindo como auto-incremento
	@Column(name="id")//definindo a coluna como id
	private Long id;
	
	@Column(name="nome")//definindo a coluna como nome
	private String nome;
	
	@Column(name="preco")//definindo a coluna como preco
	private double preco;

	
	public Produto () {}
	
	
	public Produto( String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}


	
	public Long getId() {
		return (long) id;
	}
	public void setId(Long id) {
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