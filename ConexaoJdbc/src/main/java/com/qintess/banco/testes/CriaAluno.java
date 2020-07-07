package com.qintess.banco.testes;

import com.qintes.banco.dao.AlunoDAO;
import com.qintess.banco.jdbc.ConnectionFactory;
import com.quintess.banco.modelo.Aluno;

import java.awt.List;
import java.sql.Connection;
import java.sql.SQLException;


public class CriaAluno {
	
	public static void main (String [] args) throws SQLException{
		
		Aluno aluno = new Aluno();
		aluno.setNome("Kalla");
		aluno.setEmail("kalla@gmail.com");
		aluno.setEndereco("Av. João Dias, 1200");
		aluno.setId((long)3);
		System.out.println(aluno.getNome());
		System.out.println(aluno.getEmail());
		System.out.println(aluno.getEndereco());
		System.out.println(aluno.getId());
		
		//testando conexao
		Connection con = new ConnectionFactory().getConnection();
		System.out.println("Conexão BD ok");
		con.close();
		
		//gravando registro
		AlunoDAO dao = new AlunoDAO();
		dao.insere(aluno);
		System.out.println("Gravado");
		
		//removendo registro
		//AlunoDAO dao2 = new AlunoDAO();
		//dao2.remove(aluno);
		//System.out.println("Removido!");
		
		//alterando registro
		//AlunoDAO dao2 = new AlunoDAO();
		//dao2.altera(aluno);
		//System.out.println("Alterado!");
		
		//listando registros
		AlunoDAO dao2 = new AlunoDAO();
		List <Aluno> listAluno = dao2.getLista();
		for(Aluno aluno1 : listAluno) {
			System.out.println("Nome: " + aluno1.getNome()+ 
					"Email: " + aluno1.getEmail()+
					"Endereco: "+ aluno1.getEndereco());
		}
	}
				
		
	}
	
	


