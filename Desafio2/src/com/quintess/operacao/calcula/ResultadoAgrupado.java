package com.quintess.operacao.calcula;

public class ResultadoAgrupado {

	private String subprod;
	private double result1;
	
	public ResultadoAgrupado(String subprod, double result1) {
		this.subprod = subprod;
		this.result1 = result1;
		
	}

	
	public String getSubproduto() {
		return subprod;
	}


	public void setSubprod(String subprod) {
		this.subprod = subprod;
	}


	public double getResult1() {
		return result1;
	}


	public void setResult1(double result1) {
		this.result1 = result1;
	}

	public static void add(Resultado resultado) {
		// TODO Auto-generated method stub
		
	}

}
