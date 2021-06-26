package com.ecommerce.service;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.ecommerce.model.Product;

public interface ProductService {
	int save(Product product);

    int update(Product product);

    int deleteById(int id);

    List<Product> findAll();
    
    Optional<Product> findById(int id);
    
    List<Optional<Product>> findBySeason(String season);
    
    List<Optional<Product>> findByBrand(String brand);
    
    List<Optional<Product>> findByCategory(String category);
    
    List<Optional<Product>> findByPrice(String order);
    
    List<Optional<Product>> findByColor(String color);
    
    List<Optional<Product>> findByDate(String date);

}
