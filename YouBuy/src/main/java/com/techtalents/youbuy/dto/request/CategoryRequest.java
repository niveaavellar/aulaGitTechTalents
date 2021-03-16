package com.techtalents.youbuy.dto.request;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CategoryRequest {
	
	@Size(min =  2, max = 255)
	private String name;
	
	@Size(min =  3, max = 3)
	private String code;
	
	

}
