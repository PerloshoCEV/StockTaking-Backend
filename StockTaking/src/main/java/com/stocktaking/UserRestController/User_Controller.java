package com.stocktaking.UserRestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.stocktaking.StocktakingEnums;
import com.stocktaking.UserEntity.T_Membership;
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

	@Override
	public Long createUserController(T_User newUser) {
		return userService.createUserService(newUser);
	}
	/*
            Zona de Constructor
    */
	@Override
	public Long LogInController(String email, String password)
	{
		var user = userService.findUserByEmailPasswordService(email, password);
		if(user.isPresent()){
			return (long) StocktakingEnums.MessageResult.Success.ordinal();
		}
		return (long) StocktakingEnums.MessageResult.Error.ordinal();
	}

	@Override
	public Long SignUpController(String email, String password)
	{
		var user = userService.findUserByEmailService(email);
		if(user.isPresent()){
			return (long) StocktakingEnums.MessageResult.UserExist.ordinal();
		}

		T_User newUser = new T_User();
		newUser.setAll("",
				"",
				"",
				email,
				0,
				password,
				null);
		newUser.setPermissions(new ArrayList<>());
		userService.createUserService(newUser);
		return (long) StocktakingEnums.MessageResult.Success.ordinal();
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
