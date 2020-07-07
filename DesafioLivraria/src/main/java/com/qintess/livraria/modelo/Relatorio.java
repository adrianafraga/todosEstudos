package com.qintess.livraria.modelo;

import java.sql.ResultSet;

import com.qintess.livraria.conexao.conecta;
import com.qintess.livraria.modelo.Cliente;

public class Relatorio {
	
	public static void main (String [] args){
		
		conecta con = new conecta();
		String sql2 = "select v.data,v.total,c.nome,c.telefone from venda as v inner join cliente as c on c.id = v.idcliente order by total DESC";
		ResultSet rs = con.executaBusca(sql2);
		
		
		try {
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String telefone = rs.getString("telefone");
				double total = rs.getDouble("total");
				System.out.println(id+" -"+nome+" -"+telefone+" -"+total);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
