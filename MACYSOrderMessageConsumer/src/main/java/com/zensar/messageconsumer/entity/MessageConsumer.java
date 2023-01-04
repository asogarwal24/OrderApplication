package com.zensar.messageconsumer.entity;

import com.zensar.messageconsumer.entity.MessageConsumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageConsumer {

	private int id;
	private String orderMessage;

}