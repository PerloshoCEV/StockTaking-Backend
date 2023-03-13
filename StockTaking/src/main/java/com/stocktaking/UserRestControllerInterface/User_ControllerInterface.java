package com.stocktaking.UserRestControllerInterface;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.stocktaking.UserEntity.T_User;

//import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/stocktaking")
public interface User_ControllerInterface 
{
	/*
		Método interfaz: Post Create
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@PostMapping(path = "/user")
	Long createUserController (@RequestBody T_User newUser);
	
	/*
		Método interfaz: Get Read (All)
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@GetMapping(path = "/users")
	List<T_User> readUserAllController ();
	
	/*
		Método interfaz: Get Read (Por Id)
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@GetMapping(path = "/user/{id}")
	T_User readUserIdController (@PathVariable Long id);
	
	/*
		Método interfaz: Put Update
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@PutMapping(path = "/user")
	T_User updateUserController(@RequestBody T_User user);
	
	/*
		Método interfaz: Delete
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@DeleteMapping(path = "/user/{id}")
	String deleteUserId (@RequestParam Long id); 
}
