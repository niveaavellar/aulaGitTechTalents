package com.techtalents.youbuy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtalents.youbuy.entity.OrderStatus;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Long> {
	
	public Optional<OrderStatus> findByCode(String code);


}
