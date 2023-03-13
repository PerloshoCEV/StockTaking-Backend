package com.stocktaking.UserService;

import org.springframework.stereotype.Service;

import com.stocktaking.UserEntity.EmbKey_User_Permission;
import com.stocktaking.UserEntity.T_User;
import com.stocktaking.UserEntity.T_User_Permission;
import com.stocktaking.UserRepository.UserPermission_Repository;

@Service
public class UserPermission_Service 
{
	UserPermission_Repository repository;
	
	public UserPermission_Service(UserPermission_Repository repository) {
		super();
		this.repository = repository;
	}

	public EmbKey_User_Permission createUserPermissionService(T_User_Permission newUserPermission) 
	{
		T_User_Permission userToSave = repository.save(newUserPermission);
		return userToSave.getId();
	}

}
