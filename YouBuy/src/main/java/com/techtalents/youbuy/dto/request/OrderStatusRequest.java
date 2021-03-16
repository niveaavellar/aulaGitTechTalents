package com.techtalents.youbuy.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class OrderStatusRequest {
	
	@NotNull
	private String name;
	
	@Size(min =  3, max = 3)
	private String code;

}
