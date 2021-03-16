package com.techtalents.youbuy.dto.response;

import java.util.ArrayList;
import java.util.List;

import com.techtalents.youbuy.entity.Product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductResponseDetails extends ProductResponse {
	
	public ProductResponseDetails(Product product) {
		super(product);
		this.setDetails(product.getDetails());
		
	}

	private List<String> details = new ArrayList<String>();


}
