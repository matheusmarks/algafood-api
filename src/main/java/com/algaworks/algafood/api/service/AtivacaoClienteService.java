package com.algaworks.algafood.api.service;

import com.algaworks.algafood.api.model.Client;
import com.algaworks.algafood.api.notificator.NivelUrgencia;
import com.algaworks.algafood.api.notificator.Notificador;
import com.algaworks.algafood.api.notificator.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AtivacaoClienteService {
    
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void ativar(Client cliente) {
        cliente.ativar();

        applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }

}
