package com.qintess.livraria.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import javax.sql.DataSource;

import org.postgresql.core.ConnectionFactory;

import com.qintess.livraria.conexao.conecta;
import com.qintess.livraria.modelo.Cliente;
import com.qintess.livraria.modelo.CriaItensVenda;
import com.qintess.livraria.modelo.ItensVendas;
import com.qintess.livraria.modelo.Livro;
import com.qintess.livraria.modelo.Venda;


public class DAO {
	
	
		private DataSource ds;
		
		public void setDataSource(DataSource ds) {
			this.ds = ds;
			
		}


		public void atualiza (ItensVendas itensvendas) {
	
			
		}
		
		public void buscaVenda(ItensVenda itensvenda) {
				
			String select = "SELECT TITULO, ESTOQUE, PRECO FROM LIVRO WHERE IDLIVRO = ?;";
		
			
			}
				
			}
	
			
	


	
