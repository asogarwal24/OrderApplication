package com.zensar.messageconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.messageconsumer.entity.MessageConsumer;

public interface MessageConsumerRepository extends JpaRepository<MessageConsumer, Integer> {

}