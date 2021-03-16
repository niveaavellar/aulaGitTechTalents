package com.techtalents.youbuy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtalents.youbuy.dto.request.ClientRequest;
import com.techtalents.youbuy.dto.request.OrderRequest;
import com.techtalents.youbuy.dto.response.OrderResponse;
import com.techtalents.youbuy.entity.Client;
import com.techtalents.youbuy.entity.OrderStatus;
import com.techtalents.youbuy.entity.OrderTb;
import com.techtalents.youbuy.entity.Payment;
import com.techtalents.youbuy.entity.PaymentStatus;
import com.techtalents.youbuy.entity.PaymentType;
import com.techtalents.youbuy.entity.Product;
import com.techtalents.youbuy.exception.ProductDoesNotExistsException;
import com.techtalents.youbuy.repository.ClientRepository;
import com.techtalents.youbuy.repository.OrderRepository;
import com.techtalents.youbuy.repository.OrderStatusRepository;
import com.techtalents.youbuy.repository.PaymentRepository;
import com.techtalents.youbuy.repository.ProductRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private OrderStatusRepository orderStatusRepository;

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private ProductRepository productRepository;

	public OrderResponse create(OrderRequest orderRequest) throws Throwable {
		Client client = this.clientRepository.findByEmail(orderRequest.getEmail()).orElseGet(() -> {
			ClientRequest clientRequest = new ClientRequest();
			clientRequest.setEmail(orderRequest.getEmail());
			clientRequest.setAdress(orderRequest.getAdress());
			Client clientCreated = new Client(clientRequest);
			return clientRepository.save(clientCreated);
		});

		OrderStatus status = this.orderStatusRepository.findById(orderRequest.getStatusId()).orElseThrow(null);

		Payment payment = new Payment();
		PaymentType paymentType;

		if (orderRequest.getPaymentType().equals(PaymentType.DEBIT)) {
			paymentType = PaymentType.DEBIT;
			status.setPaymentStatus(PaymentStatus.APPROVED);
			this.orderStatusRepository.save(status);
		} else {
			paymentType = PaymentType.CREDIT;
		}
		payment.setPaymentType(paymentType);
		payment.setPaymentStatus(status.getPaymentStatus());
		payment.setPaymentProcessedAddress(orderRequest.getPaymentProcessedAddress());
		this.paymentRepository.save(payment);

		List<Optional> productsOptional = new ArrayList<Optional>();

		for (Long id : orderRequest.getProductIds()) {
			productsOptional.add(this.productRepository.findById(id));
		}

		List<Product> protucts = new ArrayList<Product>();

		for (Optional product : productsOptional) {
			protucts.add((Product) product.orElseThrow(() -> new ProductDoesNotExistsException()));
		}

		OrderTb order = new OrderTb(orderRequest, client, status, payment, protucts);
		OrderTb orderCreated = this.orderRepository.save(order);
		client.orders.add(orderCreated);
		clientRepository.save(client);
		return new OrderResponse(orderCreated);

	}

}
