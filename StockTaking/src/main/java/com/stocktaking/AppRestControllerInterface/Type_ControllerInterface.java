package com.stocktaking.AppRestControllerInterface;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stocktaking.AppEntity.T_Type;
import com.stocktaking.Response.DeleteResponse;

@RequestMapping("/stocktaking")
public interface Type_ControllerInterface
{
    /*
        Método interfaz: Post Create
        Recibe:
        Objetivo:
        Devuelve:
    */
    @PostMapping(path = "/type")
    Long createTypeController (@RequestBody T_Type newType);

    /*
        Método interfaz: Get Read (All)
        Recibe:
        Objetivo:
        Devuelve:
    */
    @GetMapping(path = "/types")
    List<T_Type> readTypeAllController ();

    /*
        Método interfaz: Get Read (Por Id)
        Recibe:
        Objetivo:
        Devuelve:
    */
    @GetMapping(path = "/type")
    T_Type readTypeIdController (@RequestParam Long id);

    /*
        Método interfaz: Put Update
        Recibe:
        Objetivo:
        Devuelve:
    */
    @PutMapping(path = "/type")
    T_Type updateTypeController(@RequestBody T_Type type);

    /*
        Método interfaz: Delete
        Recibe:
        Objetivo:
        Devuelve:
    */
    @DeleteMapping(path = "/type")
    DeleteResponse deleteTypeId (@RequestParam Long id);
}

