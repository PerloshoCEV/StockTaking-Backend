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
	@Column (name = "Email", nullable = false)
	private String email;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "Age", nullable = true)
	private Integer age;
	
	// Spring JPA le dice al Gestor de Bases de Datos que la siguiente variable Java será un Atributo / Campo de la entidad.
	@Column (name = "Password", nullable = false)
	private String password;
	
	@ManyToOne()
	@JsonBackReference
	private T_Membership membership;
	
	@OneToMany(mappedBy = "user")
	private List<T_User_Permission> permissions = new ArrayList<>();

	/*
		Zona de Constructores
	*/
	public T_User() 
	{
		super();
	}
	public T_User(String name, String lastName, String secondLastName, String email, Integer age,
			String password) 
	{
		super();
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.email = email;
		this.age = age;
		this.password = password;
	}
	
	public T_User(Long id, String name, String lastName, String secondLastName, String email, Integer age,
			String password) 
	{
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.email = email;
		this.age = age;
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public T_Membership getMembership() {
		return membership;
	}
	public void setMembership(T_Membership membership) {
		this.membership = membership;
	}
	public List<T_User_Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<T_User_Permission> permissions) {
		this.permissions = permissions;
	}
	
	public void setAll(String name, String lastName, String secondLastName, String email, Integer age, String password)
	{
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.email = email;
		this.age = age;
		this.password = password;
	}
	
}
