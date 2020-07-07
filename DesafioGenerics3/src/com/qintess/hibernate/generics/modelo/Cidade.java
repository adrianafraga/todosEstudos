package com.qintess.hibernate.generics.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.qintess.hibernate.generics.base.EntidadeBase;


@Entity // anotação para mapear a tabela do banco de dados através da classe 
@Table (name="cidade") //definindo nome da tabela que está sendo mapeada
public class Cidade implements EntidadeBase { 
	
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//mapeando o campo ID, definindo como auto-incremento
	@Column(name="id")
	private Long id;
	
	@Column(name = "nome")//mapeando o campo para a coluna do banco de dados
	private String nome;
	
	//
	@OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Estado> estado = new ArrayList <Estado>();
	
	
	public Cidade( ) { //construtor simples sem argumentos	
		
	} 
	 
	
	public Cidade(String nome, List<Estado> estado) { //construtor
		this.nome = nome;
		this.estado = estado;
	}

	
	public Long getId() {
		return id;
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

	public List<Estado> getEstado() {
		return estado;
	}

	public void setEstado(List<Estado> estado) {
		this.estado = estado;
	}


	@Override //método para fins de depuração, para imprimir o objeto e os detalhes reais
	public String toString() {
		return "Cidade [id=" + id + ", nome=" + nome + ", estado=" + estado + "]";
	}


	
	
	

}
