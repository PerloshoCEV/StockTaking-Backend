package com.stocktaking.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocktaking.UserEntity.T_Permission;

public interface Permission_Repository extends JpaRepository<T_Permission, Long>
{

}
