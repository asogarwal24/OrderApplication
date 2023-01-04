package com.zensar.order.service;

import com.zensar.order.entity.Order;

public interface OrderService {

	public Order getOrder(int id);

	public Order updateOrder(int id, Order order);
}
