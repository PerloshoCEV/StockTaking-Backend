package com.stocktaking.AppEntity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity // Spring le dice al Gestor de Bases de Datos que la siguiente clase es una entidad (Tabla).
@Table(name = "T_Product_Supplier")
public class T_Product_Supplier 
{
	/*
		Zona de Atributos
	*/
	@EmbeddedId
	private EmbKey_Product_Supplier id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("productId")
	private T_Product product;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("supplierId")
	private T_Supplier supplier;

	/*
		Zona de Constructores
	*/
	public T_Product_Supplier() {
		super();
	}
	
	public T_Product_Supplier(T_Product product, T_Supplier supplier) 
	{
		super();
		this.product = product;
		this.supplier = supplier;
	}
	
	public T_Product_Supplier(EmbKey_Product_Supplier id, T_Product product, T_Supplier supplier) 
	{
		super();
		this.id = id;
		this.product = product;
		this.supplier = supplier;
	}

	/*
		Zona de Getters & Setters
	*/
	public EmbKey_Product_Supplier getId() {
		return id;
	}

	public void setId(EmbKey_Product_Supplier id) {
		this.id = id;
	}

	public T_Product getProduct() {
		return product;
	}

	public void setProduct(T_Product product) {
		this.product = product;
	}

	public T_Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(T_Supplier supplier) {
		this.supplier = supplier;
	}

	
	
	
}
