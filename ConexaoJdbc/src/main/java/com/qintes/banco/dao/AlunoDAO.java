package com.qintes.banco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qintess.banco.jdbc.ConnectionFactory;
import com.qintess.banco.testes.List;
import com.quintess.banco.modelo.Aluno;

public class AlunoDAO {
	
	private Connection connection;
	
	public AlunoDAO() {
		this.connection = new ConnectionFactory().getConnection();
		
	}
	
	public void insere(Aluno aluno) {
		String sql = "insert into aluno (nome, email, endereco) values (Kalla, kalla@gmail.com, Rua Terra viva, 123)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			//seta valores
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEmail());
			stmt.setString(3, aluno.getEndereco());
			
			//executa
			stmt.execute();
			
			//fecha statement
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException (e);
		}
	}	
		/*public void remove(Aluno aluno) {
			
			try {
				PreparedStatement stmt = connection.prepareStatement("delete from aluno where id=?");
				stmt.setLong(1, aluno.getId());
				stmt.execute();
				stmt.close();
				
				
			}catch (SQLException e) {
				throw new RuntimeException (e);
			}
		}*/
		public void altera(Aluno aluno) {
			String sql = "update aluno set nome=?, email=?, endereco=? where id=?";
			
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1, aluno.getNome());
				stmt.setString(2, aluno.getEmail());
				stmt.setString(3, aluno.getEndereco());
				stmt.setLong(4, aluno.getId());
				stmt.execute();
				stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException (e);
		}
		
	}

		public List<Aluno> getLista() {
			List <Aluno> listaluno = Aluno();
			
			return null;
		}

	
		

}
