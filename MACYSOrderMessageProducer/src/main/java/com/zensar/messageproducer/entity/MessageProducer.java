package com.zensar.messageproducer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageProducer {

	private int id;
	private String orderMessage;

}