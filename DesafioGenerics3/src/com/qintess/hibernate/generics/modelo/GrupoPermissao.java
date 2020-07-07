package com.qintess.hibernate.generics.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;


import com.qintess.hibernate.generics.base.EntidadeBase;

@Entity
public class GrupoPermissao implements EntidadeBase {
	
	@ManyToMany(mappedBy ="grupo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Grupo> grupo = new ArrayList <Grupo>();

	
	@ManyToMany(mappedBy ="permissao", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Permissao> estado = new ArrayList <Permissao>();
	
	
	

	/*public Grupo getGrupo() {
		return grupo;
	}



	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}



	public Permissao getPermissao() {
		return permissao;
	}



	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}*/



	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
