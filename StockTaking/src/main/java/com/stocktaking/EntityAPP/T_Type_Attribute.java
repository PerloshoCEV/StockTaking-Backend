package com.stocktaking.EntityAPP;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity // Spring le dice al Gestor de Bases de Datos que la siguiente clase es una entidad (Tabla).
@Table(name = "T_Type_Attribute")
public class T_Type_Attribute 
{
	/*
		Zona de Atributos
	*/
	@EmbeddedId
	private EmbKey_Type_Attribute id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("typeId")
	private T_Type type;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("attributeId")
	private T_Attribute attribute;

	public T_Type_Attribute(T_Type type, T_Attribute attribute) 
	{
		super();
		this.type = type;
		this.attribute = attribute;
	}
	
	public T_Type_Attribute(EmbKey_Type_Attribute id, T_Type type, T_Attribute attribute) 
	{
		super();
		this.id = id;
		this.type = type;
		this.attribute = attribute;
	}
	
	
}
