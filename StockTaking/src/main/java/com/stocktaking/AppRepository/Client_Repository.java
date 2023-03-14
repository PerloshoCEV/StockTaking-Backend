package com.stocktaking.AppRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocktaking.AppEntity.T_Client;



public interface Client_Repository extends JpaRepository<T_Client, Long>
{
	

}
