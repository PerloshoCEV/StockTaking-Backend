package com.stocktaking.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocktaking.UserEntity.EmbKey_User_Permission;
import com.stocktaking.UserEntity.T_User_Permission;

public interface UserPermission_Repository extends JpaRepository<T_User_Permission, EmbKey_User_Permission>
{

}
