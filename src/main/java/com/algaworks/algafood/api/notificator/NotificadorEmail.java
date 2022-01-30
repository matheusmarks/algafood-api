package com.algaworks.algafood.api.notificator;

import com.algaworks.algafood.api.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    @Autowired
    NotificadorProperties properties;

    public NotificadorEmail() {
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Client cliente, String mensagem) {
        System.out.println("Host: " + properties.getHostServidor());
        System.out.println("Porta: " + properties.getPortaServidor());

        System.out.printf("Notificando %s através do e-mail %s - %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}