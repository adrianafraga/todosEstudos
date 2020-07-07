package com.qintess.itau.Conta;

public class Cliente {

	public String nome;
	public String email;
	public String senha;
	public String cpf;
	public String rg;

	// gerado o construtor
	public Cliente(String nome, String email, String senha, String cpf, String rg, String contaCliente) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.rg = rg;
	}

	// gerado métodos get/sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
