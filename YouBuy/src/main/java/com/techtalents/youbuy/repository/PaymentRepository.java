package com.techtalents.youbuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtalents.youbuy.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
