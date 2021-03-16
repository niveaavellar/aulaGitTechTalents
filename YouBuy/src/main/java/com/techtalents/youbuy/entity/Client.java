package com.techtalents.youbuy.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.techtalents.youbuy.dto.request.ClientRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor
@Entity
public class Client {
	
	public Client (ClientRequest clientRequest) {
		this.fillFromDto(clientRequest);
		
				
	}
	
	public void fillFromDto(ClientRequest clientRequest) {
		this.setEmail(clientRequest.getEmail());
		this.setAdress(clientRequest.getAdress());
		
		
	}
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "code_category")
//	private Category category;
	
	@Column(nullable = false)
	private String adress;
	
	
	@ElementCollection
	public List<OrderTb> orders = new ArrayList<OrderTb>();
	

}
