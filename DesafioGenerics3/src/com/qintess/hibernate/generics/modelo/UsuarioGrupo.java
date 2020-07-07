package com.qintess.hibernate.generics.modelo;
import javax.persistence.Entity;

import com.qintess.hibernate.generics.base.EntidadeBase;

@Entity	
public class UsuarioGrupo implements EntidadeBase {
	
	private Usuario usuario;
	
	private Grupo grupo;
	
	
	

	public Usuario getUsuario() {
		return usuario;
	}




	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}




	public Grupo getGrupo() {
		return grupo;
	}




	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}




	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
