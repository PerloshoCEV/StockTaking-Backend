package com.stocktaking.AppService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stocktaking.AppEntity.T_Product;
import com.stocktaking.AppRepository.Product_Repository;

@Service
public class Product_Service 
{
    Product_Repository repository;
        
        public Product_Service(Product_Repository repository) 
        {
            super();
            this.repository = repository;
        }
    
        public Long createProductService(T_Product newProduct) 
        {
            T_Product productToSave = repository.save(newProduct);
            return productToSave.getId();
        }
    
        public List<T_Product> readProductAllService() 
        {
            return repository.findAll();
        }
    
        public T_Product readProductId(Long id) 
        {
            return repository.getReferenceById(id);
        }
    
        public T_Product updateProduct(T_Product product) 
        {
            T_Product productToUpdated = repository.getReferenceById(product.getId());
            productToUpdated.setAll
                (
                    product.getName(),
                    product.getStock()
                );
            return repository.save(productToUpdated);
        }
    
        public void deleteProductId(Long id) 
        {
            repository.delete(repository.getReferenceById(id));
        }
    
        public Optional<T_Product> findProductByIdService(Long id) 
        {
            return repository.findById(id);
        }
        
    }
    