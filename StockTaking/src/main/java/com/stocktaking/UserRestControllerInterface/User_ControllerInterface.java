package com.stocktaking.UserRestControllerInterface;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.stocktaking.UserEntity.T_User;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/stocktaking")
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
		Zona de Constructor
	*/
	@GetMapping(path = "/login")
	Long LogInController(@RequestParam String email,@RequestParam String password);

	@PostMapping(path = "/signup")
	Long SignUpController(T_User newUser);

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
	@GetMapping(path = "/user")
	T_User readUserIdController (@RequestParam Long id);
	
	/*
		Método interfaz: Get Read (Por Id)
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@GetMapping(path = "/userEmailPassword")
	T_User readUserEmailPasswordController (@RequestBody T_User newUser);
	
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
	@DeleteMapping(path = "/user")
	String deleteUserId (@RequestParam Long id); 
}
