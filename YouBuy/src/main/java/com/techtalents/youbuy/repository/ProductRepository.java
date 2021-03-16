package com.techtalents.youbuy.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.techtalents.youbuy.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	public Optional<Product> findByName(String name);
	
	@Query("FROM Product ORDER BY price ASC")
	List <Product>findByLowest();
	
	@Query("FROM Product ORDER BY price DESC")
	List <Product>findByHighest();

}
