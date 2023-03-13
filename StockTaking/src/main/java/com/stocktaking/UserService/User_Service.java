package com.stocktaking.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stocktaking.UserEntity.T_User;
import com.stocktaking.UserRepository.User_Repository;

@Service
public class User_Service 
{
	User_Repository repository;
	
	public User_Service(User_Repository repository) 
	{
		super();
		this.repository = repository;
	}

	public Long createUserService(T_User newUser) 
	{
		T_User userToSave = repository.save(newUser);
		return userToSave.getId();
	}

	public List<T_User> readUserAllService() 
	{
		return repository.findAll();
	}

	public T_User readUserId(Long id) 
	{
		return repository.getReferenceById(id);
	}

	public T_User updateUser(T_User user) 
	{
		T_User userToUpdated = repository.getReferenceById(user.getId());
		userToUpdated.setAll
			(
				user.getName(), 
				user.getLastName(),
				user.getSecondLastName(),
				user.getEmail(),
				user.getAge(),
				user.getPassword(),
				user.getMembership()
			);
		return repository.save(userToUpdated);
	}

	public void deleteUserId(Long id) 
	{
		repository.delete(repository.getReferenceById(id));
	}

	public Optional<T_User> findUserByIdService(Long id) 
	{
		return repository.findById(id);
	}

}
