package com.stocktaking.EntityAPP;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EmbKey_Product_Client implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	/*
		Zona de Identificadores
	*/
	@Column (name = "Product_ID")
	private Long productId;
	
	@Column (name = "Client_ID")
	private Long clientId;

	/*
		Zona de Constructores
	*/
	public EmbKey_Product_Client() 
	{
		super();
	}

	public EmbKey_Product_Client(Long productId, Long clientId) 
	{
		super();
		this.productId = productId;
		this.clientId = clientId;
	}

	/*
		Zona de Getters & Setters
	*/
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	
	public void setAll(Long productId, Long clientId)
	{
		this.productId = productId;
		this.clientId = clientId;
	}
	
	/*
		Zona de Métodos a implementar
	*/
	@Override
    public boolean equals(Object other) 
	{
        if (this == other) 
    	{
        	return true;
    	}
 
        if (other == null || getClass() != other.getClass())
            return false;
 
        EmbKey_Product_Client that = (EmbKey_Product_Client) other;
        
        return Objects.equals(productId, that.productId) &&
               Objects.equals(clientId, that.clientId);
    }
 
    @Override
    public int hashCode() 
    {
        return Objects.hash(productId, clientId);
    }

}
