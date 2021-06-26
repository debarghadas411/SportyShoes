package com.ecommerce.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
    public int save(Product product) {
        return jdbcTemplate.update(
                "insert into products (product_id, season, brand, category, price, color, created_date, discount) values(?,?,?,?,?,?,?,?)",
                product.getProductId(),product.getSeason(),product.getBrand(),product.getCategory(),product.getPrice(),product.getColor(),
                product.getCreatedDate(),product.getDiscount());
    }

    @Override
    public int update(Product product) {
        return jdbcTemplate.update(
                "update products set season = ?, brand = ?, category = ?, price = ?, color = ?, created_date = ?,"
                + " discount = ? where product_id = ?", product.getSeason(),product.getBrand(),product.getCategory(),product.getPrice(),product.getColor(),
                product.getCreatedDate(),product.getDiscount(), product.getProductId());
    }


    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update(
                "delete from products where product_id = ?",id);
    }

    @Override
    public List<Product> findAll() {
        return jdbcTemplate.query(
                "select * from products",
                (rs, rowNum) ->
                        new Product(
                                rs.getInt("product_id"),
                                rs.getString("season"),
                                rs.getString("brand"),
                                rs.getString("category"),
                                rs.getInt("price"),
                                rs.getString("color"),
                                rs.getString("created_date"),
                                rs.getInt("discount")
                        )
        );
    }

    @SuppressWarnings("deprecation")
	@Override
    public Optional<Product> findById(int id) {
        return (Optional<Product>) jdbcTemplate.queryForObject(
                "select * from products where product_id = ?",
                new Object[]{id},
                (rs, rowNum) ->
                        Optional.of(new Product(
                        		rs.getInt("product_id"),
                                rs.getString("season"),
                                rs.getString("brand"),
                                rs.getString("category"),
                                rs.getInt("price"),
                                rs.getString("color"),
                                rs.getString("created_date"),
                                rs.getInt("discount")
                        ))
        );
    }

	



	@SuppressWarnings("deprecation")
	@Override
	public List<Optional<Product>> findBySeason(String season) {
		return jdbcTemplate.query(
                "select * from products where season = ?",
                new Object[]{season},
                (rs, rowNum) ->
                        Optional.of(new Product(
                        		rs.getInt("product_id"),
                                rs.getString("season"),
                                rs.getString("brand"),
                                rs.getString("category"),
                                rs.getInt("price"),
                                rs.getString("color"),
                                rs.getString("created_date"),
                                rs.getInt("discount")
                        ))
        );

	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Optional<Product>> findByBrand(String brand) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
                "select * from products where brand = ?",
                new Object[]{brand},
                (rs, rowNum) ->
                        Optional.of(new Product(
                        		rs.getInt("product_id"),
                                rs.getString("season"),
                                rs.getString("brand"),
                                rs.getString("category"),
                                rs.getInt("price"),
                                rs.getString("color"),
                                rs.getString("created_date"),
                                rs.getInt("discount")
                        ))
        );


	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Optional<Product>> findByCategory(String category) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
                "select * from products where category = ?",
                new Object[]{category},
                (rs, rowNum) ->
                        Optional.of(new Product(
                        		rs.getInt("product_id"),
                                rs.getString("season"),
                                rs.getString("brand"),
                                rs.getString("category"),
                                rs.getInt("price"),
                                rs.getString("color"),
                                rs.getString("created_date"),
                                rs.getInt("discount")
                        ))
        );
	}

	@Override
	public List<Optional<Product>> findByPrice(String order) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
                "select * from products order by price "+order.toLowerCase(),
                (rs, rowNum) ->
                        Optional.of(new Product(
                        		rs.getInt("product_id"),
                                rs.getString("season"),
                                rs.getString("brand"),
                                rs.getString("category"),
                                rs.getInt("price"),
                                rs.getString("color"),
                                rs.getString("created_date"),
                                rs.getInt("discount")
                        ))
        );
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Optional<Product>> findByColor(String color) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
                "select * from products where color = ?",
                new Object[]{color},
                (rs, rowNum) ->
                        Optional.of(new Product(
                        		rs.getInt("product_id"),
                                rs.getString("season"),
                                rs.getString("brand"),
                                rs.getString("category"),
                                rs.getInt("price"),
                                rs.getString("color"),
                                rs.getString("created_date"),
                                rs.getInt("discount")
                        ))
        );
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Optional<Product>> findByDate(String date) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
                "select * from products where created_date = ?",
                new Object[]{date},
                (rs, rowNum) ->
                        Optional.of(new Product(
                        		rs.getInt("product_id"),
                                rs.getString("season"),
                                rs.getString("brand"),
                                rs.getString("category"),
                                rs.getInt("price"),
                                rs.getString("color"),
                                rs.getString("created_date"),
                                rs.getInt("discount")
                        ))
        );
	}
}
