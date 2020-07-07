package com.qintess.ingressos.model;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;




@Entity
@Getter @Setter
@Table(name="compra")
public class Compra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="cliente_id",nullable=false)
	private Cliente cliente;
	
	@Column(nullable = false)
	private BigDecimal valor;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate data_venda;
	
	@Column(nullable = false)
	private String status;
	
	@Column(nullable = false)
	private String observacao;
	
	@OneToMany(mappedBy = "compra", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CompraIngressos> compraIngressos = new ArrayList <CompraIngressos>();

	private BigDecimal quantidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getData_venda() {
		return data_venda;
	}

	public void setData_venda(LocalDate data_venda) {
		this.data_venda = data_venda;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<CompraIngressos> getItemVenda() {
		return compraIngressos;
	}
	
	
	/*public void adicionaIngresso(Ingresso ingresso, int quantidade) {
		
		double valor_unitario;
		CompraIngressos compraIngressos = new CompraIngressos(this, ingresso,quantidade);
		
		ingresso.add(compraIngressos);
		ingresso.getCompraIngressos().add(compraIngressos);
		
		double valorCompraIngressos = this.valor.doubleValue();
		double valorIngressoUnit = ingresso.getValor_unitario().doubleValue();	
		
		valorCompraIngressos += (valorIngressoUnit * quantidade);
		this.valor = new BigDecimal (valorCompraIngressos);
	}*/
	
}
