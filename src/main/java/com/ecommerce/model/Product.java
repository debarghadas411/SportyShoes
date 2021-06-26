package com.ecommerce.model;

import java.sql.Date;

public class Product {
	private int productId;
	private String season;
	private String brand;
	private String category;
	private int price;
	private String color;
	private String createdDate;
	private int discount;
	
	public Product(int productId, String season, String brand, String category, int price, String color,
			String createdDate, int discount) {
		this.productId = productId;
		this.season = season;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.color = color;
		this.createdDate = createdDate;
		this.discount = discount;
	}

	public Product() {
	}

	public int getProductId() {
		return productId;
	}

	public String getSeason() {
		return season;
	}

	public String getBrand() {
		return brand;
	}

	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public int getDiscount() {
		return discount;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
