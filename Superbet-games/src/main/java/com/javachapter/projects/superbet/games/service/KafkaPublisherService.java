package com.javachapter.projects.superbet.games.service;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Profile("kafka")
@Service
public class KafkaPublisherService {

    private static final String TOPIC = "quickstart";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(fixedDelay = 2000)
    public void publishMessage() {
        kafkaTemplate.send(TOPIC, RandomStringUtils.random(10, true, false));
    }
}
