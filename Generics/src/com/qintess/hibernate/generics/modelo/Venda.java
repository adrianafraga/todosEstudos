 package com.qintess.hibernate.generics.modelo;



	import java.util.ArrayList;
	import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity // anotação para mapear a tabela do banco de dados através da classe 
	@Table (name="venda") //definindo nome da tabela que está sendo mapeada
	public class Venda implements EntidadeBase {

		@Id //mapeando o campo id
		@GeneratedValue(strategy = GenerationType.IDENTITY)// definindo como auto-incremento
		@Column(name="id")//definindo a coluna como id
		private Long id;
		
		
		//lista de itens
		@OneToMany(mappedBy = "venda")
		private List <ItemVenda> itens = new ArrayList<ItemVenda>();
		
		
		private double total;


		public Long getId() {
			return (long) id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public List<ItemVenda> getItens() {
			return itens;
		}


		public void setItens(List<ItemVenda> itens) {
			this.itens = itens;
		}


		public double getTotal() {
			return total;
		}


		public void setTotal(double total) {
			this.total = total;
		}
	
	
}
