package com.qintess.hibernate.generics.modelo;



	import com.qintess.hibernate.generics.base.EntidadeBase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
import javax.persistence.Table;



	@Entity
	@Table (name = "student")
	public class ItemVenda implements EntidadeBase {
		
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		private List<Cerveja> cerveja = new ArrayList <Cerveja>();
		
		
		@ManyToOne //
		private Venda venda;
		
		@Column(name = "quantidade")
		private int qtd;
		
		@Column(name = "valor_unitario")
		private double valorUnitario;

		
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

		public Long getId() {
			return (long) id;
		}  

		public void setId(Long id) {
			this.id = id;
		}

		/*public Cerveja getCerveja() {
			return cerveja;
		}

		public void setCerveja(Cerveja cerveja) {
			this.cerveja = cerveja;
		}*/

		public Venda getVenda() {
			return venda;
		}

		public void setVenda(Venda venda) {
			this.venda = venda;
		}

		public int getQtd() {
			return qtd;
		}

		public void setQtd(int qtd) {
			this.qtd = qtd;
		}

		public double getValorUnitario() {
			return valorUnitario;
		}

		public void setValorUnitario(double valorUnitario) {
			this.valorUnitario = valorUnitario;
		}
		
		
		
	}
