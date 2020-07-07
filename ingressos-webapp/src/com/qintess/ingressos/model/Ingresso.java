package com.qintess.ingressos.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Ingresso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(mappedBy = "ingresso", cascade = CascadeType.ALL, orphanRemoval = true)
	private List <CompraIngressos> compraIngressos = new ArrayList <CompraIngressos>();
	
	public List<CompraIngressos> getCompraIngressos(){
		return compraIngressos;
	}
	
	
	public void setCompraIngressos (List<CompraIngressos> compraIngressos) {
		this.compraIngressos = compraIngressos;
	}
	
	@ManyToOne
	private Evento evento;
	
	
	@Column(nullable = false)
	private int quantidade;
	
	@Column(nullable = false)
	private double valor_unitario;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor_unitario() {
		return valor_unitario;
	}

	public void setPreco(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}
	public void add(CompraIngressos compraIngressos2) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	

}
