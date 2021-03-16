package com.techtalents.youbuy.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ClientRequest {
	
	@Email
	private String email;
	
	@NotNull
	private String adress;
	
	

}
