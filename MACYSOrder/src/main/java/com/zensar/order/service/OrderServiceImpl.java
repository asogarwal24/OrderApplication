package com.zensar.order.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.order.entity.Order;
import com.zensar.order.repository.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order getOrder(int id) {
		Optional<Order> findById = orderRepository.findById(id);
		if (findById.isPresent()) {
			Order order = findById.get();
			return order;
		} else
			return null;
	}

	@Override
	public Order updateOrder(int id, Order order) {
		Order availableOrder = getOrder(id);
		return orderRepository.save(order);
	}
}
