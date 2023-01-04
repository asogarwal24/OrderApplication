package com.zensar.messageproducer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.messageproducer.entity.MessageProducer;
import com.zensar.messageproducer.repository.MessageProducerRepository;


@Service
public class MessageProducerServiceImpl implements MessageProducerService {

	@Autowired
	private MessageProducerRepository messageProducerRepository;

	@Override
	public MessageProducer createMessage(MessageProducer messageProducer, String token) {
		if (token.equals("abhi12345")) {
			MessageProducerRepository.save(messageProducer);
		} else {
			return null;
		}
		return messageProducer;
	}
}
