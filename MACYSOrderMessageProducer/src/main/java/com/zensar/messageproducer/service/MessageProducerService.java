package com.zensar.messageproducer.service;

import com.zensar.messageproducer.entity.MessageProducer;

public interface MessageProducerService {

	MessageProducer createMessage(MessageProducer messageProducer, String token);
}
