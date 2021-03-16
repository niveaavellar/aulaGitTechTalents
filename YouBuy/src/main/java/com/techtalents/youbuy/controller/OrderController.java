package com.techtalents.youbuy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techtalents.youbuy.dto.request.OrderRequest;
import com.techtalents.youbuy.dto.response.OrderResponse;
import com.techtalents.youbuy.service.OrderService;
@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public OrderResponse post(@Valid @RequestBody OrderRequest orderRequest) throws Throwable {
		return this.orderService.create(orderRequest);
	}

}
