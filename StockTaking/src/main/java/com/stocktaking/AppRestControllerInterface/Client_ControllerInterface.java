package com.stocktaking.AppRestControllerInterface;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.stocktaking.AppEntity.T_Client;

@RequestMapping("/stocktaking")
public interface Client_ControllerInterface {

		/*
		Método interfaz: Post Create
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@PostMapping(path = "/client")
	Long createClientController (@RequestBody T_Client newClient);
	
	/*
		Método interfaz: Get Read (All)
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@GetMapping(path = "/clients")
	List<T_Client> readClientAllController ();
	
	/*
		Método interfaz: Get Read (Por Id)
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@GetMapping(path = "/client/{id}")
	T_Client readClientIdController (@PathVariable Long id);
	
	/*
		Método interfaz: Put Update
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@PutMapping(path = "/client")
	T_Client updateClientController(@RequestBody T_Client client);
	
	/*
		Método interfaz: Delete
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@DeleteMapping(path = "/client/{id}")
	String deleteClientId (@PathVariable Long id); 

}
