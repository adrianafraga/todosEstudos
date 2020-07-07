package com.quintess.operacao.calcula;

public class DadosMercado {

	@Override
	public String toString() {
		return "DadosMercado [idPreco=" + idPreco + ", nuPrazoDiasCorridos=" + nuPrazoDiasCorridos + ", vlPreco="
				+ vlPreco + "]";
	}

	private int idPreco;
	private int nuPrazoDiasCorridos;
	private float vlPreco;

	public DadosMercado() {
		this.idPreco = idPreco;
		this.nuPrazoDiasCorridos = nuPrazoDiasCorridos;
		this.vlPreco = vlPreco;
	}


	public int getIdPreco() {
		return idPreco;
	}
	public void setIdPreco(int idPreco) {
		this.idPreco = idPreco;
	}
	public int getNuPrazoDiasCorridos() {
		return nuPrazoDiasCorridos;
	}
	public void setNuPrazoDiasCorridos(int nuPrazoDiasCorridos) {
		this.nuPrazoDiasCorridos = nuPrazoDiasCorridos;
	}
	public float getVlPreco() {
		return vlPreco;
	}
	public void setVlPreco(float vlPreco) {
		this.vlPreco = vlPreco;
	}


	

}
