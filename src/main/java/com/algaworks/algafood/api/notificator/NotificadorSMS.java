package com.algaworks.algafood.api.notificator;

import com.algaworks.algafood.api.model.Client;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorSMS implements  Notificador {


    public NotificadorSMS() {
        System.out.println("NotificadorSMS");
    }


    @Override
    public void notificar(Client cliente, String mensagem) {
        System.out.printf("Notificando %s através do SMS %s: %s\n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
