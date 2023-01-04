package com.zensar.messageproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageproducer.entity.MessageProducer;
import com.zensar.messageproducer.service.MessageProducerService;

@RestController
@RequestMapping("/id")
public class MessageProducerController {

	@Autowired
	private MessageProducerService messageProducerService;

	@PostMapping(value = "/messageProducer", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public MessageProducer createMessage(@RequestBody MessageProducer messageProducer,
			@RequestHeader("auth-token") String token) {

		return messageProducerService.createMessage(messageProducer, token);

	}

}
