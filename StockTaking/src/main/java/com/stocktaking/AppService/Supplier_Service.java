package com.stocktaking.AppService;

import com.stocktaking.AppEntity.T_Supplier;
import com.stocktaking.AppRepository.Supplier_Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Supplier_Service {

    Supplier_Repository repository;

    public Supplier_Service(Supplier_Repository repository)
    {
        super();
        this.repository = repository;
    }

    public Long createSupplierService(T_Supplier newSupplier)
    {
        T_Supplier supplierToSave = repository.save(newSupplier);
        return supplierToSave.getId();
    }

    public List<T_Supplier> readSupplierAllService()
    {
        return repository.findAll();
    }

    public T_Supplier readSupplierId(Long id)
    {
        return repository.getReferenceById(id);
    }

    public T_Supplier updateSupplier(T_Supplier supplier)
    {
        T_Supplier supplierToUpdated = repository.getReferenceById(supplier.getId());
        supplierToUpdated.setAll
                (
                        supplier.getName(),
                        supplier.getEmail(),
                        supplier.getAddress()
                );
        return repository.save(supplierToUpdated);
    }

    public void deleteSupplierId(Long id)
    {
        repository.delete(repository.getReferenceById(id));
    }

    public Optional<T_Supplier> findSupplierByIdService(Long id)
    {
        return repository.findById(id);
    }
}
