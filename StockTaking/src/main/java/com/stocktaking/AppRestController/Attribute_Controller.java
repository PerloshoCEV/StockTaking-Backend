package com.stocktaking.AppRestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stocktaking.AppEntity.T_Attribute;
import com.stocktaking.AppRestControllerInterface.Attribute_ControllerInterface;
import com.stocktaking.AppService.Attribute_Service;



@RestController
public class Attribute_Controller implements Attribute_ControllerInterface
{
	@Autowired
	Attribute_Service attributeService;

	public Attribute_Controller() 
	{
		super();
	}

	/*
		Zona de Constructor
	*/
	@Override
	public Long createAttributeController(T_Attribute newAttribute) 
	{
		if (newAttribute != null)
		{
			// Si no tiene id
			if(newAttribute.getId() == null)
			{
				return attributeService.createAttributeService(newAttribute);
			}
			else
			{
				
			}
		}
		return null;
	}

	/*
		Zona de implementaciones
	*/
	@Override
	public List<T_Attribute> readAttributeAllController() 
	{
		List<T_Attribute> attributesToReturn = null;
		attributesToReturn = attributeService.readAttributeAllService();
		return attributesToReturn;
	}

	@Override
	public T_Attribute readAttributeIdController(Long id) 
	{
		T_Attribute attributeToReturn = null;
		if(attributeService.findAttributeByIdService(id).isPresent())
		{
			attributeToReturn = attributeService.findAttributeByIdService(id).get();
		}
		else
		{
			
		}
		return attributeToReturn;
	}

	@Override
	public T_Attribute updateAttributeController(T_Attribute attribute) 
	{
		T_Attribute attributeToReturn = null;
		
		
		attributeToReturn = attributeService.updateAttribute(attribute);
		
		
		return attributeToReturn;
	}

	@Override
	public String deleteAttributeId(Long id) 
	{
		String stringToReturn = "";
		
		if(id != null)
		{
			if (attributeService.findAttributeByIdService(id).isPresent())
			{
				attributeService.deleteAttributeId(id);
				stringToReturn = "Usuario eliminado correctamente";
			}
			else
			{
				stringToReturn = "Usuario con ID " + id + " no existe";
			}
		}
		else
		{
			
		}
		return stringToReturn;
	}
}
