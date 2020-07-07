package com.qintess.banco.conexao;

import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {
		
		/*Conexao con = new Conexao ();
		//String para inserir dados na tabela cliente
		String sql  = "INSERT into cliente (id, nome, email)"+
					  "values (default,'Fernanda','fernandatibo@gmail.com')";
		int res = con.executaSQL(sql);
		if(res > 0) {
			System.out.println("Cadastrado com sucesso..hehehehe");
		}else {
			System.out.println("ERRO DURANTE O CADASTRO!!!");
		}

	}*/
		
		Conexao con = new Conexao();
		String sql  = "Select * from cliente";
		ResultSet rs = con.executaBusca(sql);
		
		try {
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				System.out.println(id+" - "+nome+" - "+email);
						
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
