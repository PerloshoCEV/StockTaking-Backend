package com.stocktaking.EntityAPP;

import java.io.Serializable;
import java.util.Objects;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EmbKey_Type_Attribute implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Column (name = "Type_ID")
	private Long typeId;
	
	@Column (name = "Attribute_ID")
	private Long attributeId;

	public EmbKey_Type_Attribute() 
	{
		super();
	}

	public EmbKey_Type_Attribute(Long typeId, Long attributeId) 
	{
		super();
		this.typeId = typeId;
		this.attributeId = attributeId;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Long getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(Long attributeId) {
		this.attributeId = attributeId;
	}
	
	
	public void setAll(Long typeId, Long attributeId)
	{
		this.typeId = typeId;
		this.attributeId = attributeId;
	}
	
	@Override
    public boolean equals(Object other) {
        if (this == other) 
    	{
        	return true;
    	}
 
        if (other == null || getClass() != other.getClass())
            return false;
 
        EmbKey_Type_Attribute that = (EmbKey_Type_Attribute) other;
        
        return Objects.equals(typeId, that.typeId) &&
               Objects.equals(attributeId, that.attributeId);
    }
 
    @Override
    public int hashCode() 
    {
        return Objects.hash(typeId, attributeId);
    }
	
}
