package com.stocktaking.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocktaking.UserEntity.T_User;

public interface User_Repository extends JpaRepository<T_User, Long>
{

}
