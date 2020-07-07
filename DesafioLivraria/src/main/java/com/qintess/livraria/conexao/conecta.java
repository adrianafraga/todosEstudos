package com.qintess.livraria.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class conecta {

	//varíaveis
	private String  url;
	private String user;
	private String password;
	private Connection con;
	
	
	//método construtor
	public conecta (){
		url = "jdbc:postgresql://localhost:5432/projeto_01";
		user = "postgres";
		password = "Drix";
	
		//tratamento de erros
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão realizada com sucesso!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//método
	public int executaSQL(String sql) {
		
		try {
			Statement stm = con.createStatement(); // stm cria a conexao
			int res = stm.executeUpdate(sql); // variavel do tipo inteiro que vai retornar um resultado, recebendo o objeto stm, executar o update
			con.close(); //fecho a conexao
			return res; //retorno o valor
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}

public ResultSet executaBusca (String sql) {
	
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


public java.sql.PreparedStatement PreparedStatement(String sqlselect) {
	// TODO Auto-generated method stub
	return null;
}

public static conecta getConnection() {
	// TODO Auto-generated method stub
	return null;
}

}
