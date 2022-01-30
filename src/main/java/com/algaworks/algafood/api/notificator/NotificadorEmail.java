package com.algaworks.algafood.api.notificator;

import com.algaworks.algafood.api.model.Client;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {


    public NotificadorEmail() {
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Client cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s - %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}