package com.stocktaking.AppService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stocktaking.AppEntity.T_Client;
import com.stocktaking.AppRepository.Client_Repository;

@Service
public class Client_Service {

Client_Repository repository;
	
	public Client_Service(Client_Repository repository) 
	{
		super();
		this.repository = repository;
	}

	public Long createClientService(T_Client newClient) 
	{
		T_Client clientToSave = repository.save(newClient);
		return clientToSave.getId();
	}

	public List<T_Client> readClientAllService() 
	{
		return repository.findAll();
	}

	public T_Client readClientId(Long id) 
	{
		return repository.getReferenceById(id);
	}

	public T_Client updateClient(T_Client client) 
	{
		T_Client clientToUpdated = repository.getReferenceById(client.getId());
		clientToUpdated.setAll
			(
				client.getName(),
				client.getLastName()
			);
		return repository.save(clientToUpdated);
	}

	public void deleteClientId(Long id) 
	{
		repository.delete(repository.getReferenceById(id));
	}

	public Optional<T_Client> findClientByIdService(Long id) 
	{
		return repository.findById(id);
	}
	
}
