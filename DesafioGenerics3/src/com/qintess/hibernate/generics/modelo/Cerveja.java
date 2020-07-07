package com.qintess.hibernate.generics.modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.qintess.hibernate.generics.base.EntidadeBase;
import com.qintess.hibernate.generics.modelo.*;

public class Cerveja implements EntidadeBase {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (length = 200, nullable = false)
	private String sku;
	
	@Column (length = 200, nullable = false)
	private String nome;
	
	private String descricao;
	
	private double valor;
	
	private double teor_alcoolico;
	
	private double comissao;
	
	private String sabor;
	
	private String origem;
	
	@ManyToOne
	private Estilo estilo;
	
	@OneToMany
	private ItemVenda item_venda;
	
	private int qtd_estoque;
	
	private String foto;
	
	private String content_type;
	
	

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTeor_alcoolico() {
		return teor_alcoolico;
	}

	public void setTeor_alcoolico(double teor_alcoolico) {
		this.teor_alcoolico = teor_alcoolico;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	public int getQtd_estoque() {
		return qtd_estoque;
	}

	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ItemVenda getItem_venda() {
		return item_venda;
	}

	public void setItem_venda(ItemVenda item_venda) {
		this.item_venda = item_venda;
	}
	


	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
