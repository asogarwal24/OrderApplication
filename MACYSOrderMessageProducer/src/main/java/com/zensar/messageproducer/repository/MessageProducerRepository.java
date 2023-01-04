package com.zensar.messageproducer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.messageproducer.entity.MessageProducer;

public interface MessageProducerRepository extends JpaRepository<MessageProducer, Integer> {

}