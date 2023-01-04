package com.zensar.messageconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageconsumer.entity.MessageConsumer;
import com.zensar.messageconsumer.service.MessageConsumerService;

@RestController
@RequestMapping("/id")
public class MessageConsumerController {

	@Autowired
	private MessageConsumerService messageConsumerService;

	@GetMapping(value = "/advertise/{advertiseId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public MessageConsumer getMessage(@PathVariable int id) {
		return messageConsumerService.getMessage(id);
	}

}
