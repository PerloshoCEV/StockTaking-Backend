package com.stocktaking.AppRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocktaking.AppEntity.T_Product;

public interface Product_Repository extends JpaRepository<T_Product, Long>
{

}
