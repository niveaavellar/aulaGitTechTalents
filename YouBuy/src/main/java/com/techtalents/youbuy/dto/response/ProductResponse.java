package com.techtalents.youbuy.dto.response;

import com.techtalents.youbuy.entity.Product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductResponse {
	
	public ProductResponse(Product product) {
		this.setId(product.getId());
		this.setName(product.getName());
		this.setPrice(product.getPrice());
		
		
		
		CategoryResponse categoryResponse = new CategoryResponse(product.getCategory());
		this.setCategory(categoryResponse);
		
		
	}
	

	private Long id;
	
	private String name;
	
	private Double price;
	

	private CategoryResponse category;

}
