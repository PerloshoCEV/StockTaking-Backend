package com.stocktaking.UserRestControllerInterface;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stocktaking.UserEntity.EmbKey_User_Permission;
import com.stocktaking.UserEntity.T_User;
import com.stocktaking.UserEntity.T_User_Permission;


@RequestMapping("/stocktaking")
public interface UserPermission_ControllerInterface 
{
	/*
		Método interfaz: Post Create
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@PostMapping(path = "/userpermission")
	EmbKey_User_Permission createUserPermissionController (@RequestBody T_User_Permission newUserPermission);
	
	/*
		Método interfaz: Get Read (All)
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@GetMapping(path = "/users-permission-id")
	List<T_User> readUsersWithPermissionIdController (@PathVariable Long id);
	
	/*
		Método interfaz: Get Read (Por Id)
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@GetMapping(path = "/permission-user-id")
	List<T_User> readPermissionsWithUserIdController (@PathVariable Long id);
	
	/*
		Método interfaz: Put Update
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@PutMapping(path = "/userpermission")
	T_User_Permission updateUserController(@RequestBody T_User_Permission userPermission);
	
	/*
		Método interfaz: Delete
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@DeleteMapping(path = "/userpermission/{id}")
	String deleteUserId (@PathVariable Long id); 
}
