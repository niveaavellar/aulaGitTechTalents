package com.techtalents.youbuy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techtalents.youbuy.dto.request.OrderStatusRequest;
import com.techtalents.youbuy.dto.response.OrderStatusResponse;
import com.techtalents.youbuy.service.OrderStatusService;

@RestController
@RequestMapping("/orderStatus")
public class OrderStatusController {
	
	@Autowired
	private OrderStatusService orderStatusService;
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public OrderStatusResponse post(@Valid @RequestBody OrderStatusRequest orderStatusRequest) {
		return this.orderStatusService.create(orderStatusRequest);
	}

}
