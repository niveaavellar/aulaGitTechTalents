package com.techtalents.youbuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtalents.youbuy.entity.OrderTb;

public interface OrderRepository extends JpaRepository<OrderTb, Long>{

}
