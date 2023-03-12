package com.stocktaking.EntityUsers;

import java.util.ArrayList;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity // Spring le dice al Gestor de Bases de Datos que la siguiente clase es una entidad (Tabla).
@Table(name = "T_user")
public class T_User 
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
	@Column (name = "LastName", nullable = false)
	String lastName;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "SecondLastName", nullable = true)
	String secondLastName;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "Email", nullable = false)
	String email;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "Age", nullable = true)
	Integer age;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "Password", nullable = false)
	String password;
	
	@ManyToOne()
	@JsonBackReference
	T_Membership membership;
	
	@OneToMany(mappedBy = "user")
	List<T_User_Permission> permissions = new ArrayList<>();
}
