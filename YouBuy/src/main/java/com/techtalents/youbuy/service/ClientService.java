package com.techtalents.youbuy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtalents.youbuy.dto.request.ClientRequest;
import com.techtalents.youbuy.dto.response.ClientResponse;
import com.techtalents.youbuy.dto.response.OrderResponse;
import com.techtalents.youbuy.entity.Client;
import com.techtalents.youbuy.entity.OrderTb;
import com.techtalents.youbuy.exception.ClientDoesNotExistsException;
import com.techtalents.youbuy.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public ClientResponse create(ClientRequest clientRequest) {
		Client client = new Client(clientRequest);
		Client clientCreated = this.clientRepository.save(client);
		return new ClientResponse(clientCreated);
	}
	
	public ClientResponse update(ClientRequest clientRequest, Long id) {
		Optional<Client> clientOptional = this.clientRepository.findById(id);
		Client client = clientOptional.orElseThrow(() -> new ClientDoesNotExistsException());
		client.fillFromDto(clientRequest);
		this.clientRepository.save(client);
		return new ClientResponse(client);
	}
	
	public List<OrderResponse>get(Long id){
		Optional<Client> clientOptional = this.clientRepository.findById(id);
		Client client = clientOptional.orElseThrow(() -> new ClientDoesNotExistsException());
		ClientResponse clientResponse = new ClientResponse(client);
		List<OrderTb> orders = clientResponse.getOrders();
		List<OrderResponse> ordersResponse = new ArrayList<OrderResponse>();
		for(OrderTb order: orders) {
			OrderResponse orderResponse = new OrderResponse(order);
			ordersResponse.add(orderResponse);
		}
		
		return ordersResponse;
	}

}
