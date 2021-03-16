package com.techtalents.youbuy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtalents.youbuy.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
	public Optional<Client> findByEmail(String email);

}
