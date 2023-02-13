package com.javachapter.projects.superbet.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("rest")
@Service
public class RestConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

    public void receive(String message) {
        logger.info("Message is: {}", message);
    }

}
