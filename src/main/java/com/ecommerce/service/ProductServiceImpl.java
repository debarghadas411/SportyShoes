package com.ecommerce.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository pr; 
	
	@Override
	public int save(Product product) {
		// TODO Auto-generated method stub
		return pr.save(product);
	}

	@Override
	public int update(Product product) {
		// TODO Auto-generated method stub
		return pr.update(product);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return pr.deleteById(id);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Optional<Product> findById(int id) {
		// TODO Auto-generated method stub
		return pr.findById(id);
	}

	@Override
	public List<Optional<Product>> findBySeason(String season) {
		// TODO Auto-generated method stub
		return pr.findBySeason(season);
	}

	@Override
	public List<Optional<Product>> findByBrand(String brand) {
		// TODO Auto-generated method stub
		return pr.findByBrand(brand);
	}

	@Override
	public List<Optional<Product>> findByCategory(String category) {
		// TODO Auto-generated method stub
		return pr.findByCategory(category);
	}

	@Override
	public List<Optional<Product>> findByPrice(String order) {
		// TODO Auto-generated method stub
		return pr.findByPrice(order);
	}

	@Override
	public List<Optional<Product>> findByColor(String color) {
		// TODO Auto-generated method stub
		return pr.findByColor(color);
	}

	@Override
	public List<Optional<Product>> findByDate(String date) {
		// TODO Auto-generated method stub
		return pr.findByDate(date);
	}

}
