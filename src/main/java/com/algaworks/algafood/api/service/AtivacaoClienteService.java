package com.algaworks.algafood.api.service;

import com.algaworks.algafood.api.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
public class AtivacaoClienteService {
    
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void ativar(Client cliente) {
        cliente.ativar();

        applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }

}
