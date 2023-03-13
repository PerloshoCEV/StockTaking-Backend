package com.stocktaking.AppService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stocktaking.AppEntity.T_Attribute;
import com.stocktaking.AppRepository.Attribute_Repository;


@Service
public class Attribute_Service 
{
Attribute_Repository repository;
	
	public Attribute_Service(Attribute_Repository repository) 
	{
		super();
		this.repository = repository;
	}

	public Long createAttributeService(T_Attribute newAttribute) 
	{
		T_Attribute attributeToSave = repository.save(newAttribute);
		return attributeToSave.getId();
	}

	public List<T_Attribute> readAttributeAllService() 
	{
		return repository.findAll();
	}

	public T_Attribute readAttributeId(Long id) 
	{
		return repository.getReferenceById(id);
	}

	public T_Attribute updateAttribute(T_Attribute attribute) 
	{
		T_Attribute attributeToUpdated = repository.getReferenceById(attribute.getId());
		attributeToUpdated.setAll
			(
					attribute.getName(),
					attribute.getDescription()
			);
		return repository.save(attributeToUpdated);
	}

	public void deleteAttributeId(Long id) 
	{
		repository.delete(repository.getReferenceById(id));
	}

	public Optional<T_Attribute> findAttributeByIdService(Long id) 
	{
		return repository.findById(id);
	}
}
