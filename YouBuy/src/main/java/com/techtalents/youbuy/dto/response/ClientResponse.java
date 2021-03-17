package com.techtalents.youbuy.dto.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.techtalents.youbuy.entity.Client;
import com.techtalents.youbuy.entity.OrderTb;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientResponse {
	
	public ClientResponse(Client client) {
		this.setId(client.getId());
		this.setEmail(client.getEmail());
		this.setAdress(client.getAdress());
		this.setOrders(client.getOrders());
	}
	
	private Long id;
	
	private String email;
	
	private String adress;
	
	@JsonIgnore //Era isso que faltava, oque gerou o loop na apresentação do "put client"! Com isso, está corrigido!
	private List<OrderTb> orders = new ArrayList<OrderTb>();

}
