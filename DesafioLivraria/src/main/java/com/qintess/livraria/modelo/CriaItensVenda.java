package com.qintess.livraria.modelo;

import com.qintess.livraria.conexao.conecta;

public class CriaItensVenda {
	
	public static void main(String[] args) {
		
	conecta con = new conecta();
	String sql ="INSERT INTO itens_venda (iditensvenda, quantidade, subtotal,estoque,idvenda,idlivro)"+
			 			"values(default, 1,39.90,1,21,9)";

	int resultado = con.executaSQL(sql);
	if(resultado > 0) {
		System.out.println("Cadastrado com sucesso!!!");
	}else {
		System.out.println("Erro durante o cadastro!!!");
	}
  }
}
