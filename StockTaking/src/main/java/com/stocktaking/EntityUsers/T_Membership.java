package com.stocktaking.EntityUsers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity // Spring le dice al Gestor de Bases de Datos que la siguiente clase es una entidad (Tabla).
@Table(name = "T_Membership")
public class T_Membership 
{
	/*
		Zona de Atributos
	*/
	@Id // Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable java será el Atributo / Campo clave de la entidad.
	@GeneratedValue(strategy = GenerationType.SEQUENCE) // Spring JPA le dice al Gestor de Bases de Datos que el Atributo será autogenerado.
	Long id; // Variable - Atributo / Campo -> id (Primary Key).
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "Name", nullable = false)
	String name;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "Price", nullable = false)
	Double price;
	
	@OneToMany(mappedBy = "membership")
	@JsonManagedReference
	List<T_User> users;
}
