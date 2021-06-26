package com.ecommerce.controller;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value = "/product", method = RequestMethod.POST)
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	@Autowired
	private ProductService ps;
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public @ResponseBody Product insertProduct(@RequestBody Product P) {
		ps.save(P);
		return P;
		
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public @ResponseBody int deleteProduct(@PathVariable int id) {
		
		return ps.deleteById(id);
		
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody Product updateProduct(@RequestBody Product P) {
		ps.update(P);
		return P;
		
	}
	@RequestMapping(value = "/listall", method = RequestMethod.POST)
	public @ResponseBody List<Product> listAllProducts(){
		return ps.findAll();
		
	}
	@RequestMapping(value = "/find/{id}", method = RequestMethod.POST)
	public @ResponseBody Optional<Product> findProductById(@PathVariable int id) {
		
		return ps.findById(id);
		
	}
	@RequestMapping(value = "/findbyseason/{season}", method = RequestMethod.POST)
	public @ResponseBody List<Optional<Product>> findProductById(@PathVariable String season) {
		//System.out.println(season);
		return ps.findBySeason(season);
		
	}
	@RequestMapping(value = "/findbybrand/{brand}", method = RequestMethod.POST)
	public @ResponseBody List<Optional<Product>> findProductByBrand(@PathVariable String brand) {
		return ps.findByBrand(brand);
		
	}
	@RequestMapping(value = "/findbycategory/{category}", method = RequestMethod.POST)
	public @ResponseBody List<Optional<Product>> findProductByCategory(@PathVariable String category) {
		return ps.findByCategory(category);
		
	}
	@RequestMapping(value = "/orderbyprice/{order}", method = RequestMethod.POST)
	public @ResponseBody List<Optional<Product>> orderProductByPrice(@PathVariable String order) {
		return ps.findByPrice(order);
		
	}
	@RequestMapping(value = "/findbycolor/{color}", method = RequestMethod.POST)
	public @ResponseBody List<Optional<Product>> findProductByColor(@PathVariable String color) {
		return ps.findByColor(color);
		
	}
	@RequestMapping(value = "/findbydate/{date}", method = RequestMethod.POST)
	public @ResponseBody List<Optional<Product>> findProductByDate(@PathVariable String date) {
		System.out.println(date);
		return ps.findByDate(date);
		
	} 
}
