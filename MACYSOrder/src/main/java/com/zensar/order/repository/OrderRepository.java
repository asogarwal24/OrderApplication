package com.zensar.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}