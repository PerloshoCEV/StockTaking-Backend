package com.stocktaking.EntityAPP;

import java.util.ArrayList;
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
@Table(name = "T_Type")
public class T_Type 
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
	@Column (name = "Description", nullable = false)
	String description;
	
	@OneToMany(mappedBy = "type")
	@JsonManagedReference
	List<T_Product> products;
	
	@OneToMany(mappedBy = "type")
	List<T_Type_Attribute> attributes = new ArrayList<>();

	public T_Type() {
		super();
	}

	public T_Type(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public T_Type(Long id, String name, String description, List<T_Product> products,
			List<T_Type_Attribute> attributes) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.products = products;
		this.attributes = attributes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<T_Product> getProducts() {
		return products;
	}

	public void setProducts(List<T_Product> products) {
		this.products = products;
	}

	public List<T_Type_Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<T_Type_Attribute> attributes) {
		this.attributes = attributes;
	}
	
	
}
