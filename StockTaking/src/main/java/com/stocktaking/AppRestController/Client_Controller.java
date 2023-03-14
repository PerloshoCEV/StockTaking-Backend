package com.stocktaking.AppRestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stocktaking.AppEntity.T_Client;
import com.stocktaking.AppRestControllerInterface.Client_ControllerInterface;
import com.stocktaking.AppService.Client_Service;

@RestController
public class Client_Controller implements Client_ControllerInterface
{
	@Autowired
	Client_Service clientService;

	public Client_Controller() 
	{
		super();
	}

	/*
		Zona de Constructor
	*/
	@Override
	public Long createClientController(T_Client newClient) 
	{
		if (newClient != null)
		{
			// Si no tiene id
			if(newClient.getId() == null)
			{
				return clientService.createClientService(newClient);
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
	public List<T_Client> readClientAllController() 
	{
		List<T_Client> clientsToReturn = null;
		clientsToReturn = clientService.readClientAllService();
		return clientsToReturn;
	}

	@Override
	public T_Client readClientIdController(Long id) 
	{
		T_Client clientToReturn = null;
		if(clientService.findClientByIdService(id).isPresent())
		{
			clientToReturn = clientService.findClientByIdService(id).get();
		}
		else
		{
			
		}
		return clientToReturn;
	}

	@Override
	public T_Client updateClientController(T_Client client) 
	{
		T_Client clientToReturn = null;
		
		
		clientToReturn = clientService.updateClient(client);
		
		
		return clientToReturn;
	}

	@Override
	public String deleteClientId(Long id) 
	{
		String stringToReturn = "";
		
		if(id != null)
		{
			if (clientService.findClientByIdService(id).isPresent())
			{
				clientService.deleteClientId(id);
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

