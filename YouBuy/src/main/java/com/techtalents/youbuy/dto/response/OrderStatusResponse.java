package com.techtalents.youbuy.dto.response;

import com.techtalents.youbuy.entity.OrderStatus;
import com.techtalents.youbuy.entity.PaymentStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderStatusResponse {
	
	public OrderStatusResponse(OrderStatus orderStatus) {
		this.setId(orderStatus.getId());
		this.setName(orderStatus.getName());
		this.setCode(orderStatus.getCode()+String.format("%02d", orderStatus.getId()));
		this.setPaymentStatus(orderStatus.getPaymentStatus());
	}
	
	private Long id;
	
	private String name;
	
	private String code;
	
	private PaymentStatus paymentStatus;

}
