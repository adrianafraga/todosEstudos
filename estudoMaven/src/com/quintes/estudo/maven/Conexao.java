package com.quintes.estudo.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
	
	//variáveis
	private String url;
	private String usuario;
	private String senha;
	private Connection con; //precisa importar java.sql
	
	//metodo contrstrutor
	Conexao () {
		url = "jdbc:h2:~/test", "sa","";
		usuario =  "sa";
		senha = "";
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conexão realizada com sucesso!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	//metodo executa SQL
	
	public int executaSQL(String sql) {
		try {
			Statement stm = con.createStatement(); //conexão
			int res = stm.executeUpdate(sql);
			con.close();
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
	}
	

	}
	//
	public ResultSet executaBusca(String sql) {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			con.close();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}

