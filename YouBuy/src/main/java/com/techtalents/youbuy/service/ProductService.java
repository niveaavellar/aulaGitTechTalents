package com.techtalents.youbuy.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.techtalents.youbuy.dto.request.ProductRequest;
import com.techtalents.youbuy.dto.response.ProductResponse;
import com.techtalents.youbuy.dto.response.ProductResponseDetails;
import com.techtalents.youbuy.entity.Category;
import com.techtalents.youbuy.entity.Product;
import com.techtalents.youbuy.exception.CategoryDoesNotExistsException;
import com.techtalents.youbuy.exception.ProductDoesNotExistsException;
import com.techtalents.youbuy.repository.CategoryRepository;
import com.techtalents.youbuy.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public ProductResponse create(ProductRequest productRequest) {
		Category category = this.categoryRepository.findByCode(productRequest.getCodeCategory())
				.orElseThrow(() -> new CategoryDoesNotExistsException());
		Product product = new Product(productRequest, category);
		
		Product productCreated = this.productRepository.save(product);
		return new ProductResponseDetails(productCreated);
		
	}
	
	public ProductResponse update(ProductRequest productRequest, Long id) {
		Optional<Product> productOptional = this.productRepository.findById(id);
		Product product = productOptional.orElseThrow(() -> new ProductDoesNotExistsException());
		product.fillFromDto(productRequest);
		this.productRepository.save(product);
		return new ProductResponse(product);
	}
	
	public void delete(Long id) {
		Optional<Product> productOptional = this.productRepository.findById(id);
		Product product = productOptional.orElseThrow(() -> new ProductDoesNotExistsException());
		this.productRepository.delete(product);
				
	}
	
	public List<ProductResponse> getAll(Integer quantity){
		
		Page<Product> products = this.productRepository.findAll(PageRequest.of(0, quantity, Sort.by(Sort.Direction.ASC, "name")));
		return products.getContent().stream().map(ProductResponse::new).collect(Collectors.toList());
	}
	
	public List<ProductResponse> getAllByLowest(){
		return this.productRepository.findByLowest().stream().map(ProductResponse::new).collect(Collectors.toList());
	}	
	
	public List<ProductResponse> getAllByHighest(){
		return this.productRepository.findByHighest().stream().map(ProductResponse::new).collect(Collectors.toList());
	}
	
	public ProductResponse get(Long id) {
		Optional<Product> productOptional = this.productRepository.findById(id);
		Product product = productOptional.orElseThrow(() -> new ProductDoesNotExistsException());
		return new ProductResponseDetails(product);
		
		

	}
	
	

}
