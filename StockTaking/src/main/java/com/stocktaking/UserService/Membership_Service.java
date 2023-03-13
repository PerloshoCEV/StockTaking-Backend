package com.stocktaking.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stocktaking.UserEntity.T_Membership;
import com.stocktaking.UserRepository.Membership_Repository;

@Service
public class Membership_Service 
{
	Membership_Repository repository;
	
	public Membership_Service(Membership_Repository repository) 
	{
		super();
		this.repository = repository;
	}

	public Long createMembershipService(T_Membership newMembership) 
	{
		T_Membership userToSave = repository.save(newMembership);
		return userToSave.getId();
	}

	public List<T_Membership> readMembershipAllService() 
	{
		return repository.findAll();
	}

	public T_Membership readMembershipId(Long id) 
	{
		return repository.getReferenceById(id);
	}

	public T_Membership updateMembership(T_Membership membership) 
	{
		T_Membership membershipToUpdated = repository.getReferenceById(membership.getId());
		membershipToUpdated.setAll
			(
					membership.getName(),
					membership.getPrice()
			);
		return repository.save(membershipToUpdated);
	}

	public void deleteMembershipId(Long id) 
	{
		repository.delete(repository.getReferenceById(id));
	}

	public Optional<T_Membership> findMembershipByIdService(Long id) 
	{
		return repository.findById(id);
	}
}
