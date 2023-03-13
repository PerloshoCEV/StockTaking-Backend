package com.stocktaking.UserRestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stocktaking.UserEntity.T_Membership;
import com.stocktaking.UserRestControllerInterface.Membership_ControllerInterface;
import com.stocktaking.UserService.Membership_Service;



@RestController
public class Membership_Controller implements Membership_ControllerInterface
{
	@Autowired
	Membership_Service membershipService;

	public Membership_Controller() 
	{
		super();
	}

	/*
		Zona de Constructor
	*/
	@Override
	public Long createMembershipController(T_Membership newMembership) 
	{
		if (newMembership != null)
		{
			// Si no tiene id
			if(newMembership.getId() == null)
			{
				return membershipService.createMembershipService(newMembership);
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
	public List<T_Membership> readMembershipAllController() 
	{
		List<T_Membership> usersToReturn = null;
		usersToReturn = membershipService.readMembershipAllService();
		return usersToReturn;
	}

	@Override
	public T_Membership readMembershipIdController(Long id) 
	{
		T_Membership userToReturn = null;
		if(membershipService.findMembershipByIdService(id).isPresent())
		{
			userToReturn = membershipService.findMembershipByIdService(id).get();
		}
		else
		{
			
		}
		return userToReturn;
	}

	@Override
	public T_Membership updateMembershipController(T_Membership user) 
	{
		T_Membership userToReturn = null;
		
		
		userToReturn = membershipService.updateMembership(user);
		
		
		return userToReturn;
	}

	@Override
	public String deleteMembershipId(Long id) 
	{
		String stringToReturn = "";
		
		if(id != null)
		{
			if (membershipService.findMembershipByIdService(id).isPresent())
			{
				membershipService.deleteMembershipId(id);
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
