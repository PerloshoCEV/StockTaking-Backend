package com.stocktaking.EntityAPP;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity // Spring le dice al Gestor de Bases de Datos que la siguiente clase es una entidad (Tabla).
@Table(name = "T_Supplier")
public class T_Supplier 
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
	@Column (name = "Email", nullable = false)
	String email;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "Address", nullable = false)
	String address;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "Description", nullable = true)
	String description;
	
	@OneToMany(mappedBy = "supplier")
	List<T_Product_Supplier> products = new ArrayList<>();
}
