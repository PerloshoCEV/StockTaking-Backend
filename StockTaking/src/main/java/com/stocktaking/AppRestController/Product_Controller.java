package com.stocktaking.AppRestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stocktaking.AppEntity.T_Product;
import com.stocktaking.AppRestControllerInterface.Product_ControllerInterface;
import com.stocktaking.AppService.Product_Service;

@RestController
public class Product_Controller implements Product_ControllerInterface
{
	@Autowired
	Product_Service productService;

	public Product_Controller() 
	{
		super();
	}

	/*
		Zona de Constructor
	*/
	@Override
	public Long createProductController(T_Product newProduct) 
	{
		if (newProduct != null)
		{
			// Si no tiene id
			if(newProduct.getId() == null)
			{
				return productService.createProductService(newProduct);
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
	public List<T_Product> readProductAllController() 
	{
		List<T_Product> productsToReturn = null;
		productsToReturn = productService.readProductAllService();
		return productsToReturn;
	}

	@Override
	public T_Product readProductIdController(Long id) 
	{
		T_Product productToReturn = null;
		if(productService.findProductByIdService(id).isPresent())
		{
			productToReturn = productService.findProductByIdService(id).get();
		}
		else
		{
			
		}
		return productToReturn;
	}

	@Override
	public T_Product updateProductController(T_Product product) 
	{
		T_Product productToReturn = null;
		
		
		productToReturn = productService.updateProduct(product);
		
		
		return productToReturn;
	}

	@Override
	public String deleteProductId(Long id) 
	{
		String stringToReturn = "";
		
		if(id != null)
		{
			if (productService.findProductByIdService(id).isPresent())
			{
				productService.deleteProductId(id);
				stringToReturn = "Atributo eliminado correctamente";
			}
			else
			{
				stringToReturn = "Atributo con ID " + id + " no existe";
			}
		}
		else
		{
			
		}
		return stringToReturn;
	}
}

