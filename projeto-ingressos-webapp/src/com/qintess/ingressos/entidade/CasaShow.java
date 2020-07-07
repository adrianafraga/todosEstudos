package com.qintess.ingressos.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="casaShow")
public class CasaShow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String alvara;
	
	@Column(nullable = false)
	private String endereco;
	
	@Column(nullable = false)
	private String numero;
	
	@Column(nullable = false)
	private String complemento;
	
	@Column(nullable = false)
	private String cep;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false)
	private String estado;
	
	
	@Column(nullable = false)
	private int capacidade_total;

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

	public String getAlvara() {
		return alvara;
	}

	public void setAlvara(String alvara) {
		this.alvara = alvara;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCapacidade_total() {
		return capacidade_total;
	}

	public void setCapacidade_total(int capacidade_total) {
		this.capacidade_total = capacidade_total;
	}

	@Override
	public String toString() {
		return "CasaShow [id=" + id + ", nome=" + nome + ", alvara=" + alvara + ", endereco=" + endereco + ", numero="
				+ numero + ", complemento=" + complemento + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado
				+ ", capacidade_total=" + capacidade_total + "]";
	}

	

	
	
	
	

}
