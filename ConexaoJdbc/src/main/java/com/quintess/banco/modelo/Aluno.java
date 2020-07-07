package com.quintess.banco.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class Aluno {
	
	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private String connection;
	
	
	public Aluno() {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List <Aluno> getLista(){
		
		List <Aluno> listAluno = new ArrayList <Aluno> ();
		return listAluno;
		
		PreparedStatement stmt;
		try {
			stmt = this.connection.preparedStatement("select * from aluno order by nome");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setId(rs.getLong("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setEmail(rs.getString("email"));
				aluno.setEndereco(rs.getString("endereco"));
				listAluno.add(aluno);
		}	
				rs.close();
				stmt.close();
		}
		catch (SQLException e) {
		throw new RuntimeException(e);
	}
	return listAluno;
	
}
}
