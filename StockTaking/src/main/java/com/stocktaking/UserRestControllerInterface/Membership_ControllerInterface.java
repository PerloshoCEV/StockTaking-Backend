package com.stocktaking.UserRestControllerInterface;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stocktaking.UserEntity.T_Membership;


@RequestMapping("/stocktaking")
public interface Membership_ControllerInterface 
{
	/*
		Método interfaz: Post Create
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@PostMapping(path = "/membership")
	Long createMembershipController (@RequestBody T_Membership newMembership);
	
	/*
		Método interfaz: Get Read (All)
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@GetMapping(path = "/memberships")
	List<T_Membership> readMembershipAllController ();
	
	/*
		Método interfaz: Get Read (Por Id)
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@GetMapping(path = "/membership/{id}")
	T_Membership readMembershipIdController (@PathVariable Long id);
	
	/*
		Método interfaz: Put Update
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@PutMapping(path = "/membership")
	T_Membership updateMembershipController(@RequestBody T_Membership membership);
	
	/*
		Método interfaz: Delete
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@DeleteMapping(path = "/membership/{id}")
	String deleteMembershipId (@RequestParam Long id); 
}
