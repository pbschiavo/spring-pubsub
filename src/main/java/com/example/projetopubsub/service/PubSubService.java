package com.example.projetopubsub.service;

import com.example.projetopubsub.gcp.publisher.Publisher;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PubSubService {

    private final Publisher publisher;
    public void publicarMensagem(String message) {
        publisher.publicarMensagem(message);
    }
}
