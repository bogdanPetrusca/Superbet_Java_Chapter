package com.javachapter.projects.superbet.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Profile("kafka")
@Service
public class KafkaConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "quickstart", groupId = "0")
    public void listenGroupFoo(String message) {
        logger.info(String.format("Message is: %s", message));
    }
}
