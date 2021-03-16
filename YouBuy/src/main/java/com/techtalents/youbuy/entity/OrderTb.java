package com.techtalents.youbuy.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.techtalents.youbuy.dto.request.OrderRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor
@Entity
public class OrderTb {
	
	public OrderTb (OrderRequest orderRequest, Client client, OrderStatus status, Payment payment, List<Product> products) {
		this.fillFromDto(orderRequest);
		this.setClient(client);
		this.setStatus(status);
		this.setPayment(payment);
		this.setProducts(products);
		this.setDate(LocalDateTime.now());
		String dateString = date.toString();
		this.setCode(""+dateString.charAt(5)+dateString.charAt(6)
				+dateString.charAt(0)+dateString.charAt(1)
				+dateString.charAt(2)+dateString.charAt(3)
				+dateString.charAt(11)+dateString.charAt(12)
				+dateString.charAt(14)+dateString.charAt(15)
				);
		
	}
	
	public void fillFromDto(OrderRequest orderRequest) {
		this.setDeliveredAddress(orderRequest.getDeliveredAddress());
		
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ElementCollection
	private List<Product> products = new ArrayList<Product>();
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_client")
	private Client client;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "status_id", referencedColumnName = "id")
	private OrderStatus status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "payment_id", referencedColumnName = "id")
	private Payment payment;
	
	@Column(nullable = false)
	private String deliveredAddress;
	
	@Column(name = "local_date_time", columnDefinition = "TIMESTAMP")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime date;
	
	@Column(nullable = false, unique = true)
	private String code;

}
