package com.algaworks.algafood.api.service;

import com.algaworks.algafood.api.model.Client;
import com.algaworks.algafood.api.notificator.NivelUrgencia;
import com.algaworks.algafood.api.notificator.Notificador;
import com.algaworks.algafood.api.notificator.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AtivacaoClienteService {

    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired(required = false)
    private Notificador notificador;

    @PostConstruct
    public void init() {
        System.out.println("INIT" + notificador);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DESTROY");
    }


    public void ativar(Client cliente) {
        cliente.ativar();

        if (notificador != null) {
                notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        } else {
            System.out.println("Não foi possível notificar, porém seu cadastro está ativo !");
        }
    }

}
