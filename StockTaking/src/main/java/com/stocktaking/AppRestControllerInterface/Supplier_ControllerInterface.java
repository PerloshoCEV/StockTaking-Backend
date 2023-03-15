package com.stocktaking.AppRestControllerInterface;

import com.stocktaking.AppEntity.T_Supplier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/stocktaking")
public interface Supplier_ControllerInterface {

    /*
        Método interfaz: Post Create
        Recibe:
        Objetivo:
        Devuelve:
    */
    @PostMapping(path = "/supplier")
    Long createSupplierController (@RequestBody T_Supplier newSupplier);

    /*
        Método interfaz: Get Read (All)
        Recibe:
        Objetivo:
        Devuelve:
    */
    @GetMapping(path = "/suppliers")
    List<T_Supplier> readSupplierAllController ();

    /*
        Método interfaz: Get Read (Por Id)
        Recibe:
        Objetivo:
        Devuelve:
    */
    @GetMapping(path = "/supplier/{id}")
    T_Supplier readSupplierIdController (@PathVariable Long id);

    /*
        Método interfaz: Put Update
        Recibe:
        Objetivo:
        Devuelve:
    */
    @PutMapping(path = "/supplier")
    T_Supplier updateSupplierController(@RequestBody T_Supplier supplier);

    /*
        Método interfaz: Delete
        Recibe:
        Objetivo:
        Devuelve:
    */
    @DeleteMapping(path = "/supplier/{id}")
    String deleteSupplierId (@PathVariable Long id);
}
