package com.qintess.hibernate.generics.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.qintess.hibernate.generics.base.EntidadeBase;

@Entity
public class Venda implements EntidadeBase {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String data_criacao;
	
	private double valor_frete;
	
	private double valor_desconto;
	
	private double valor_total;
	
	private String status;
	
	private String observacao;
	
	private String data_hora_entrega;
	
	private Cliente cliente;
	
	private Usuario usuario;
	

	
	
	//lista de itens
	@OneToMany(mappedBy = "venda")
	private List <ItemVenda> item_venda = new ArrayList<ItemVenda>();




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getData_criacao() {
		return data_criacao;
	}




	public void setData_criacao(String data_criacao) {
		this.data_criacao = data_criacao;
	}




	public double getValor_frete() {
		return valor_frete;
	}




	public void setValor_frete(double valor_frete) {
		this.valor_frete = valor_frete;
	}




	public double getValor_desconto() {
		return valor_desconto;
	}




	public void setValor_desconto(double valor_desconto) {
		this.valor_desconto = valor_desconto;
	}




	public double getValor_total() {
		return valor_total;
	}




	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
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




	public String getData_hora_entrega() {
		return data_hora_entrega;
	}




	public void setData_hora_entrega(String data_hora_entrega) {
		this.data_hora_entrega = data_hora_entrega;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	public Usuario getUsuario() {
		return usuario;
	}




	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}




	public List<ItemVenda> getItens() {
		return item_venda;
	}




	public void setItens(List<ItemVenda> itens) {
		this.item_venda = item_venda;
	}

	
	

	

}

