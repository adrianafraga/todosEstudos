package com.qintess.ingressos.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.Getter;
import lombok.Setter;



@Entity
@Getter @Setter
public class CompraIngressos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("compraId")
	private Compra compra;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("ingressoId")
	private Ingresso ingresso;
	
	@Column(nullable = false)
	private double valor_unitario;
	

	
	
	private CompraIngressos() {}
	
	
	 public CompraIngressos(int id, Compra compra, Ingresso ingresso, double preco, double valor_unitario) {
	
		this.id = id;
		this.compra = compra;
		this.ingresso = ingresso;
		this.valor_unitario = valor_unitario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}	
	public Ingresso getIngresso() {
		return ingresso;
	}

	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}

	
	public double getValor_unitario() {
		return valor_unitario;
	}

	public void setValor_unitario(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}


}
