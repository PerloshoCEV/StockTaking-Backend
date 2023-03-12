package com.stocktaking.EntityAPP;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity // Spring le dice al Gestor de Bases de Datos que la siguiente clase es una entidad (Tabla).
@Table(name = "T_Product_Client")
public class T_Product_Client 
{
	/*
		Zona de Atributos
	*/
	@EmbeddedId
	private EmbKey_Product_Client id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("productId")
	private T_Product product;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("clientId")
	private T_Client client;

	public T_Product_Client() 
	{
		super();
	}
	
	public T_Product_Client(T_Product product, T_Client client) 
	{
		super();
		this.product = product;
		this.client = client;
	}
	
	public T_Product_Client(EmbKey_Product_Client id, T_Product product, T_Client client) 
	{
		super();
		this.id = id;
		this.product = product;
		this.client = client;
	}

	public EmbKey_Product_Client getId() {
		return id;
	}

	public void setId(EmbKey_Product_Client id) {
		this.id = id;
	}

	public T_Product getProduct() {
		return product;
	}

	public void setProduct(T_Product product) {
		this.product = product;
	}

	public T_Client getClient() {
		return client;
	}

	public void setClient(T_Client client) {
		this.client = client;
	}
	
	
}
