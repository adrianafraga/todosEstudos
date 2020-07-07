package com.qintess.hibernate.generics.modelo;

import javax.persistence.CascadeType;

public @interface OnetoMany {

	CascadeType cascade();

}
