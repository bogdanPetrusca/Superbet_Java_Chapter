package com.javachapter.projects.superbet.games.service;

import com.netflix.discovery.EurekaClient;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Profile("rest")
@Service
public class RestPublisherService {

    private final RestTemplate restTemplate;

    private final EurekaClient eurekaClient;

    public RestPublisherService(RestTemplate restTemplate, EurekaClient eurekaClient) {
        this.restTemplate = restTemplate;
        this.eurekaClient = eurekaClient;
    }

    @Scheduled(fixedRate = 10000)
    public void publishMessage() {
        var url = eurekaClient.getNextServerFromEureka("SUPERBET-API",false).getHomePageUrl();
        restTemplate.postForEntity(url + "receive", RandomStringUtils.random(10, true, false), String.class);
    }
}
