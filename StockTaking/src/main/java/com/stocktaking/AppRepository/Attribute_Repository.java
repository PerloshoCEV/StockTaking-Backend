package com.stocktaking.AppRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocktaking.AppEntity.T_Attribute;

public interface Attribute_Repository  extends JpaRepository<T_Attribute, Long>
{

}
