package com.quintess.operacao.calcula;

public class Operacoes {

	@Override
	public String toString() {
		return "Operacoes [dtInicio=" + dtInicio + ", dtFim=" + dtFim + ", nmSubproduto=" + nmSubproduto
				+ ", quantidade=" + quantidade + ", idPreco=" + idPreco + ", prazo=" + prazo + "]";
	}

	private String dtInicio;
	private String dtFim;
	private String nmSubproduto;
	private double quantidade;
	private int idPreco;
	public long prazo;

	public Operacoes() {
	}

	public Operacoes(String dtInicio, String dtFim, String nmSubproduto, double quantidade, int idPreco, long prazo) {
		super();
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.nmSubproduto = nmSubproduto;
		this.quantidade = quantidade;
		this.idPreco = idPreco;
		this.prazo = prazo;

	}

	public String getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}

	public String getDtFim() {
		return dtFim;
	}

	public void setDtFim(String dtFim) {
		this.dtFim = dtFim;
	}

	public long getPrazo() {
		return prazo;
	}

	public void setPrazo(long prazo) {
		this.prazo = prazo;
	}
	public String getNmSubproduto() {
		return nmSubproduto;
	}

	public void setNmSubproduto(String nmSubproduto) {
		this.nmSubproduto = nmSubproduto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public int getIdPreco() {
		return idPreco;
	}

	public void setIdPreco(int idPreco) {
		this.idPreco = idPreco;
	}
}
