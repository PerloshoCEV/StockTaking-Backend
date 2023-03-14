package com.stocktaking.UserRestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stocktaking.UserEntity.T_User;
import com.stocktaking.UserRestControllerInterface.User_ControllerInterface;
import com.stocktaking.UserService.User_Service;

@RestController
public class User_Controller implements User_ControllerInterface
{
	@Autowired
	User_Service userService;

	public User_Controller() 
	{
		super();
	}

	/*
		Zona de Constructor
	*/
	@Override
	public Long createUserController(T_User newUser) 
	{
		if (newUser != null)
		{
			// Si no tiene id
			if(newUser.getId() == null)
			{
				return userService.createUserService(newUser);
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
	public List<T_User> readUserAllController() 
	{
		List<T_User> usersToReturn = null;
		usersToReturn = userService.readUserAllService();
		return usersToReturn;
	}

	@Override
	public T_User readUserIdController(Long id) 
	{
		T_User userToReturn = null;
		if(userService.findUserByIdService(id).isPresent())
		{
			userToReturn = userService.findUserByIdService(id).get();
		}
		else
		{
			
		}
		return userToReturn;
	}
	
	@Override
	public T_User readUserNamePasswordController(T_User newUser) 
	{
		T_User userToReturn = null;
		if
		(
			(newUser.getEmail() != "" || newUser.getEmail() != null)
			&&
			(newUser.getPassword() != "" || newUser.getPassword() != null)
		)
		{
			Optional<T_User> userExist = null;
			userExist = userService.findUserByEmailService(newUser.getEmail());
			if(userExist.isPresent())
			{
				userToReturn = userExist.get();
			}
			else
			{
				//Lanzar error
			}
			
		}
		else
		{
			
		}
		return userToReturn;
	}

	@Override
	public T_User updateUserController(T_User user) 
	{
		T_User userToReturn = null;
		
		
		userToReturn = userService.updateUser(user);
		
		
		return userToReturn;
	}

	@Override
	public String deleteUserId(Long id) 
	{
		String stringToReturn = "";
		
		if(id != null)
		{
			if (userService.findUserByIdService(id).isPresent())
			{
				userService.deleteUserId(id);
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
