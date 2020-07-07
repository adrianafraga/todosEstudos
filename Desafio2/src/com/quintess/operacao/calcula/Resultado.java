package com.quintess.operacao.calcula;

public class Resultado {

	private String subproduto;
	private double resultado;
	
	public Resultado(String nmSubproduto, double result) {
		this.subproduto = nmSubproduto;
		this.resultado = result;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Resultado [subproduto=" + subproduto + ", resultado=" + resultado + "]";
	}
	public String getSuproduto() {
		return subproduto;
	}
	public void setSuproduto(String subproduto) {
		this.subproduto = subproduto;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	

	
}
