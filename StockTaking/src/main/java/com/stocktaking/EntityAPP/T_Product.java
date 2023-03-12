package com.stocktaking.EntityAPP;

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
@Table(name = "T_Product")
public class T_Product 
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
	@Column (name = "Stock", nullable = false)
	Integer Stock;
	
	@ManyToOne()
	@JsonBackReference
	T_Type type;
	
	@OneToMany(mappedBy = "product")
	List<T_Product_Client> clients = new ArrayList<>();
	
	@OneToMany(mappedBy = "product")
	List<T_Product_Supplier> suppliers = new ArrayList<>();

	public T_Product() {
		super();
	}

	public T_Product(Long id, String name, Integer stock, T_Type type) {
		super();
		this.id = id;
		this.name = name;
		Stock = stock;
		this.type = type;
	}

	public T_Product(Long id, String name, Integer stock, T_Type type, List<T_Product_Client> clients,
			List<T_Product_Supplier> suppliers) {
		super();
		this.id = id;
		this.name = name;
		Stock = stock;
		this.type = type;
		this.clients = clients;
		this.suppliers = suppliers;
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

	public Integer getStock() {
		return Stock;
	}

	public void setStock(Integer stock) {
		Stock = stock;
	}

	public T_Type getType() {
		return type;
	}

	public void setType(T_Type type) {
		this.type = type;
	}

	public List<T_Product_Client> getClients() {
		return clients;
	}

	public void setClients(List<T_Product_Client> clients) {
		this.clients = clients;
	}

	public List<T_Product_Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<T_Product_Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	
	
}
