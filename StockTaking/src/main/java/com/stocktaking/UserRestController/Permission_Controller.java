package com.stocktaking.UserRestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stocktaking.UserEntity.T_Permission;
import com.stocktaking.UserRestControllerInterface.Permission_ControllerInterface;
import com.stocktaking.UserService.Permission_Service;



@RestController
public class Permission_Controller implements Permission_ControllerInterface
{
	@Autowired
	Permission_Service permissionService;

	public Permission_Controller() 
	{
		super();
	}

	/*
		Zona de Constructor
	*/
	@Override
	public Long createPermissionController(T_Permission newPermission) 
	{
		if (newPermission != null)
		{
			// Si no tiene id
			if(newPermission.getId() == null)
			{
				return permissionService.createPermissionService(newPermission);
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
	public List<T_Permission> readPermissionAllController() 
	{
		List<T_Permission> usersToReturn = null;
		usersToReturn = permissionService.readPermissionAllService();
		return usersToReturn;
	}

	@Override
	public T_Permission readPermissionIdController(Long id) 
	{
		T_Permission userToReturn = null;
		if(permissionService.findPermissionByIdService(id).isPresent())
		{
			userToReturn = permissionService.findPermissionByIdService(id).get();
		}
		else
		{
			
		}
		return userToReturn;
	}

	@Override
	public T_Permission updatePermissionController(T_Permission user) 
	{
		T_Permission userToReturn = null;
		
		
		userToReturn = permissionService.updatePermission(user);
		
		
		return userToReturn;
	}

	@Override
	public String deletePermissionId(Long id) 
	{
		String stringToReturn = "";
		
		if(id != null)
		{
			if (permissionService.findPermissionByIdService(id).isPresent())
			{
				permissionService.deletePermissionId(id);
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
