package com.stocktaking.AppRepository;

import com.stocktaking.AppEntity.T_Attribute;
import com.stocktaking.AppEntity.T_Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Supplier_Repository extends JpaRepository<T_Supplier, Long> {

}
