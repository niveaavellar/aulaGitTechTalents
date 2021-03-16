package com.techtalents.youbuy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.techtalents.youbuy.dto.request.CategoryRequest;
import com.techtalents.youbuy.dto.response.CategoryResponse;
import com.techtalents.youbuy.dto.response.ProductResponse;
import com.techtalents.youbuy.entity.Category;
import com.techtalents.youbuy.exception.CategoryDoesNotExistsException;
import com.techtalents.youbuy.exception.CodeAlreadyExistsException;
import com.techtalents.youbuy.exception.NameAlreadyExistsException;
import com.techtalents.youbuy.repository.CategoryRepository;
import com.techtalents.youbuy.repository.ProductRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public CategoryResponse create(CategoryRequest categoryRequest) {
		Category category = new Category(categoryRequest);
		try {
			Category categoryCreated = this.categoryRepository.save(category);

			return new CategoryResponse(categoryCreated);
		} catch (DataIntegrityViolationException e) {
			if(this.categoryRepository.findByCode(categoryRequest.getCode()).isPresent()) {
				throw new CodeAlreadyExistsException();
			} else if (this.categoryRepository.findByName(categoryRequest.getName()).isPresent()) {
				throw new NameAlreadyExistsException();
			} else {
				throw e;
			}
		}
	}
	
	public List<ProductResponse> get(Long id) {
		Optional<Category> categoryOptional = this.categoryRepository.findById(id);
		Category category = categoryOptional.orElseThrow(() -> new CategoryDoesNotExistsException());
		CategoryResponse categoryResponse = new CategoryResponse(category);
		List<ProductResponse> products = this.productRepository.findAll().stream().map(ProductResponse::new).collect(Collectors.toList());
		
		ArrayList<ProductResponse> productsFromCategory = new ArrayList<ProductResponse>();
		
		for(ProductResponse product : products) {
			if (product.getCategory().getId() == categoryResponse.getId()) {
				productsFromCategory.add(product);
				
			}
		}
		List<ProductResponse>productsFromCategoryList = productsFromCategory;
		return productsFromCategoryList;
	}

}
