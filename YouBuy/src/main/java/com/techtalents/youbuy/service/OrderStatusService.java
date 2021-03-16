package com.techtalents.youbuy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtalents.youbuy.dto.request.OrderStatusRequest;
import com.techtalents.youbuy.dto.response.OrderStatusResponse;
import com.techtalents.youbuy.entity.OrderStatus;
import com.techtalents.youbuy.repository.OrderStatusRepository;

@Service
public class OrderStatusService {
	
	@Autowired
	private OrderStatusRepository orderStatusRepository;
	
	
	public OrderStatusResponse create(OrderStatusRequest orderStatusRequest) {
		OrderStatus orderStatus = new OrderStatus(orderStatusRequest);
		OrderStatus orderStatusCreated = this.orderStatusRepository.save(orderStatus);

		return new OrderStatusResponse(orderStatusCreated);

	}
	

}
