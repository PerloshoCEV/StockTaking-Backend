package com.stocktaking.UserRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocktaking.UserEntity.T_User;

public interface User_Repository extends JpaRepository<T_User, Long>
{

	Optional<T_User> findByEmail(String email);

}
