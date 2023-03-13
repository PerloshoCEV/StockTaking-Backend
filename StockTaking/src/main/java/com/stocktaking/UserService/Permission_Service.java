package com.stocktaking.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stocktaking.UserEntity.T_Permission;
import com.stocktaking.UserRepository.Permission_Repository;

@Service
public class Permission_Service 
{
Permission_Repository repository;
	
	public Permission_Service(Permission_Repository repository) 
	{
		super();
		this.repository = repository;
	}

	public Long createPermissionService(T_Permission newPermission) 
	{
		T_Permission permissionToSave = repository.save(newPermission);
		return permissionToSave.getId();
	}

	public List<T_Permission> readPermissionAllService() 
	{
		return repository.findAll();
	}

	public T_Permission readPermissionId(Long id) 
	{
		return repository.getReferenceById(id);
	}

	public T_Permission updatePermission(T_Permission permission) 
	{
		T_Permission permissionToUpdated = repository.getReferenceById(permission.getId());
		permissionToUpdated.setAll
			(
					permission.getName(),
					permission.getDescription()
			);
		return repository.save(permissionToUpdated);
	}

	public void deletePermissionId(Long id) 
	{
		repository.delete(repository.getReferenceById(id));
	}

	public Optional<T_Permission> findPermissionByIdService(Long id) 
	{
		return repository.findById(id);
	}
}
