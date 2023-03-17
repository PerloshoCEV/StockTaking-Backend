package com.stocktaking.AppRepository;


import com.stocktaking.AppEntity.T_Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Type_Repository extends JpaRepository<T_Type, Long>
{

}
