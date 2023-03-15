package com.stocktaking.AppRestController;

import com.stocktaking.AppEntity.T_Supplier;
import com.stocktaking.AppRestControllerInterface.Supplier_ControllerInterface;
import com.stocktaking.AppRestControllerInterface.Supplier_ControllerInterface;
import com.stocktaking.AppService.Supplier_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Supplier_Controller implements Supplier_ControllerInterface {

    @Autowired
    Supplier_Service supplierService;

    public Supplier_Controller()
    {
        super();
    }

    /*
        Zona de Constructor
    */
    @Override
    public Long createSupplierController(T_Supplier newSupplier)
    {
        if (newSupplier != null)
        {
            // Si no tiene id
            if(newSupplier.getId() == null)
            {
                return supplierService.createSupplierService(newSupplier);
            }
            else
            {

            }
        }
        return null;
    }

    /*
        Zona de implementaciones
    */
    @Override
    public List<T_Supplier> readSupplierAllController()
    {
        List<T_Supplier> suppliersToReturn = null;
        suppliersToReturn = supplierService.readSupplierAllService();
        return suppliersToReturn;
    }

    @Override
    public T_Supplier readSupplierIdController(Long id)
    {
        T_Supplier supplierToReturn = null;
        if(supplierService.findSupplierByIdService(id).isPresent())
        {
            supplierToReturn = supplierService.findSupplierByIdService(id).get();
        }
        else
        {

        }
        return supplierToReturn;
    }

    @Override
    public T_Supplier updateSupplierController(T_Supplier supplier)
    {
        T_Supplier supplierToReturn = null;


        supplierToReturn = supplierService.updateSupplier(supplier);


        return supplierToReturn;
    }

    @Override
    public String deleteSupplierId(Long id)
    {
        String stringToReturn = "";

        if(id != null)
        {
            if (supplierService.findSupplierByIdService(id).isPresent())
            {
                supplierService.deleteSupplierId(id);
                stringToReturn = "Usuario eliminado correctamente";
            }
            else
            {
                stringToReturn = "Usuario con ID " + id + " no existe";
            }
        }
        else
        {

        }
        return stringToReturn;
    }
}
