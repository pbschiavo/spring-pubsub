package com.example.projetopubsub.controller;

import com.example.projetopubsub.dto.SolicitacaoDTO;
import com.example.projetopubsub.service.PubSubService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pubsub")
@RequiredArgsConstructor
public class PubSubController{

    private final PubSubService pubSubService;

    @PostMapping("/publisher")
    public ResponseEntity<String> teste(@RequestBody SolicitacaoDTO solicitacaoDTO){
        pubSubService.publicarMensagem(new Gson().toJson(solicitacaoDTO));
        return ResponseEntity.ok(HttpStatus.OK.getReasonPhrase());
    }
}
