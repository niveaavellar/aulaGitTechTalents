package com.techtalents.youbuy.dto.request;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ProductRequest {
	
	@Size(max = 255)
	private String name;
	
	@NotNull
	private String codeCategory;
	
	@Positive
	private Double price;
	
	@NotNull
	private List<String> details;
	
	

}
