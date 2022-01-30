package com.algaworks.algafood.api.listener;

import com.algaworks.algafood.api.notificator.NivelUrgencia;
import com.algaworks.algafood.api.notificator.Notificador;
import com.algaworks.algafood.api.notificator.TipoDoNotificador;
import com.algaworks.algafood.api.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), " seu cadastor no sistema está ativo !");
    }
}
