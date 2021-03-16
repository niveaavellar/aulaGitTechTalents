package com.techtalents.youbuy.dto.response;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.techtalents.youbuy.entity.OrderStatus;
import com.techtalents.youbuy.entity.OrderTb;
import com.techtalents.youbuy.entity.Payment;
import com.techtalents.youbuy.entity.Product;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class OrderResponse {
	
	public OrderResponse(OrderTb order) {
		this.setId(order.getId());
		this.setProducts(order.getProducts());

		this.setStatus(order.getStatus());
		this.setPayment(order.getPayment());

		this.setDate(order.getDate());
		this.setCode(order.getCode()+String.format("%02d", this.getId()));
	}
	
	
	
	
	private Long id;
	
	private List<Product> products = new ArrayList<Product>();
	

	
	private OrderStatus status;
	
	private Payment payment;
	

	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime date;
	
	@Column(nullable = false, unique = true)
	private String code;

}
