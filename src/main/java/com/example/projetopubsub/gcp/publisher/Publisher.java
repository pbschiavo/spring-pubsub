package com.example.projetopubsub.gcp.publisher;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class Publisher {

    private final PubSubTemplate pubSubTemplate;

    @Value("${spring.pubsub.topic-id}")
    private String topico;

    public void publicarMensagem(String message) {
        pubSubTemplate.publish(topico, message);
    }

}
