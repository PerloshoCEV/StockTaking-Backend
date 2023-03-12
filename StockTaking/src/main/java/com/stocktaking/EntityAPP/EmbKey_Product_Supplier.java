package com.stocktaking.EntityAPP;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EmbKey_Product_Supplier  implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	/*
		Zona de Identificadores
	*/
	@Column (name = "Product_ID")
	private Long productId;
	
	@Column (name = "Supplier_ID")
	private Long supplierId;

	/*
		Zona de Constructores
	*/
	public EmbKey_Product_Supplier() 
	{
	}
	
	public EmbKey_Product_Supplier(Long productId, Long supplierId) 
	{
		super();
		this.productId = productId;
		this.supplierId = supplierId;
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

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	
	public void setAll(Long productId, Long supplierId)
	{
		this.productId = productId;
		this.supplierId = supplierId;
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
 
        EmbKey_Product_Supplier that = (EmbKey_Product_Supplier) other;
        
        return Objects.equals(productId, that.productId) &&
               Objects.equals(supplierId, that.supplierId);
    }
 
    @Override
    public int hashCode() 
    {
        return Objects.hash(productId, supplierId);
    }

	
}
