package com.co.lumens.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaMqSender {

	private static final Logger log = LoggerFactory.getLogger(FacturaMqSender.class);

	private final static String QUEUE_NAME = "spring-boot";

	private final RabbitTemplate rabbitTemplate;

	@Autowired
	public FacturaMqSender(final RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendMessage(String message) {

		log.info("Sending message...");
		rabbitTemplate.convertAndSend(QUEUE_NAME, message);
	}

}
