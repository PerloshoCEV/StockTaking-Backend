package com.stocktaking.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocktaking.UserEntity.T_Membership;

public interface Membership_Repository extends JpaRepository<T_Membership, Long>
{

}
