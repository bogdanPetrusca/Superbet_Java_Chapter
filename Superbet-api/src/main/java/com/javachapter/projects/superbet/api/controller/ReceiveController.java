package com.javachapter.projects.superbet.api.controller;

import com.javachapter.projects.superbet.api.service.RestConsumerService;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Profile("rest")
@RestController
public class ReceiveController {

    private final RestConsumerService restConsumerService;

    public ReceiveController(RestConsumerService restConsumerService) {
        this.restConsumerService = restConsumerService;
    }

    @PostMapping("/receive")
    public ResponseEntity<String> receive(@RequestBody String message) {
        restConsumerService.receive(message);
        return ResponseEntity.ok("ok");
    }
}
