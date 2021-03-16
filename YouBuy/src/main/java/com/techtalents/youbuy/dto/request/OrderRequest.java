package com.techtalents.youbuy.dto.request;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.techtalents.youbuy.entity.Payment;
import com.techtalents.youbuy.entity.PaymentType;
import com.techtalents.youbuy.entity.Product;

import lombok.Data;

@Data
public class OrderRequest {
	
	@Email
	private String email;
	
	@NotNull
	private String adress;
	
	@NotNull
	private Long statusId;
	
	@NotNull
	private List<Long> productIds;
	
	@NotNull
	private String deliveredAddress;
	
	@NotNull
	private PaymentType paymentType;
	
	@NotNull
	private String paymentProcessedAddress;

}
