package com.stocktaking.AppRestControllerInterface;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stocktaking.AppEntity.T_Product;

@RequestMapping("/stocktaking")
public interface Product_ControllerInterface 
{
	/*
		Método interfaz: Post Create
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@PostMapping(path = "/product")
	Long createProductController (@RequestBody T_Product newProduct);
	
	/*
		Método interfaz: Get Read (All)
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@GetMapping(path = "/products")
	List<T_Product> readProductAllController ();
	
	/*
		Método interfaz: Get Read (Por Id)
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@GetMapping(path = "/product")
	T_Product readProductIdController (@RequestParam Long id);
	
	/*
		Método interfaz: Put Update
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@PutMapping(path = "/product")
	T_Product updateProductController(@RequestBody T_Product product);
	
	/*
		Método interfaz: Delete
		Recibe:
		Objetivo:
		Devuelve:
	*/
	@DeleteMapping(path = "/product")
	String deleteProductId (@RequestParam Long id); 
}

