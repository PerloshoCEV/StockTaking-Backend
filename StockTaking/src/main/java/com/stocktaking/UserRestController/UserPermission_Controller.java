package com.stocktaking.UserRestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stocktaking.UserEntity.EmbKey_User_Permission;
import com.stocktaking.UserEntity.T_User;
import com.stocktaking.UserEntity.T_User_Permission;
import com.stocktaking.UserRestControllerInterface.UserPermission_ControllerInterface;
import com.stocktaking.UserService.Permission_Service;
import com.stocktaking.UserService.UserPermission_Service;
import com.stocktaking.UserService.User_Service;

@RestController
public class UserPermission_Controller implements UserPermission_ControllerInterface 
{
	@Autowired
	UserPermission_Service userPermissionService;
	
	@Autowired
	User_Service userService;
	
	@Autowired
	Permission_Service permissionService;

	public UserPermission_Controller() 
	{
		super();
	}

	@Override
	public EmbKey_User_Permission createUserPermissionController(T_User_Permission newUserPermission) {
		if (newUserPermission != null)
		{
			return userPermissionService.createUserPermissionService(newUserPermission);
		}
		return null;
	}

	@Override
	public List<T_User> readUsersWithPermissionIdController(Long id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T_User> readPermissionsWithUserIdController(Long id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T_User_Permission updateUserController(T_User_Permission userPermission) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUserId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
