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
@Table(name = "T_Client")
public class T_Client 
{
	/*
		Zona de Atributos
	*/
	@Id // Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable java será el Atributo / Campo clave de la entidad.
	@GeneratedValue(strategy = GenerationType.SEQUENCE) // Spring JPA le dice al Gestor de Bases de Datos que el Atributo será autogenerado.
	private Long id; // Variable - Atributo / Campo -> id (Primary Key).
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "Name", nullable = false)
	private String name;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "LastName", nullable = false)
	private String lastName;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "SecondLastName", nullable = true)
	private String secondLastName;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "Age", nullable = true)
	private Integer age;
	
	@OneToMany(mappedBy = "client")
	private List<T_Product_Client> products = new ArrayList<>();

	/*
		Zona de Constructores
	*/
	public T_Client() 
	{
		super();
	}
	
	public T_Client(String name, String lastName, String secondLastName, Integer age) 
	{
		super();
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.age = age;
	}
	
	public T_Client(Long id, String name, String lastName, String secondLastName, Integer age) 
	{
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.age = age;
	}

	
	/*
		Zona de Getters & Setters
	*/
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<T_Product_Client> getProducts() {
		return products;
	}

	public void setProducts(List<T_Product_Client> products) {
		this.products = products;
	}
	
	public void setAll(Long id, String name, String lastName, String secondLastName, Integer age)
	{
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.age = age;
	}
}
