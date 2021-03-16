package com.techtalents.youbuy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtalents.youbuy.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	public Optional<Category> findByCode(String code);
	public Optional<Category> findByName(String name);

}
