package com.zensar.messageconsumer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.messageconsumer.entity.MessageConsumer;

import com.zensar.messageconsumer.repository.MessageConsumerRepository;


@Service
public class MessageConsumerServiceImpl implements MessageConsumerService {
	
	@Autowired
	private MessageConsumerRepository  messageConsumerRepository;

	@Override
	public MessageConsumer getMessage(int id) {
		Optional<MessageConsumer> findById = messageConsumerRepository.findById(id);
		if (findById.isPresent()) {
			MessageConsumer messageConsumer = findById.get();
			return messageConsumer;
		} else
			return null;
	}

}