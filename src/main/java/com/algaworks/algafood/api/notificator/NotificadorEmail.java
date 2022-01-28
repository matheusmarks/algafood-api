package com.algaworks.algafood.api.notificator;

import com.algaworks.algafood.api.model.Client;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("high")
public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSMTP;

    public NotificadorEmail(String hostServidorSMTP) {
        this.hostServidorSMTP = hostServidorSMTP;
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Client cliente, String mensagem) {
        if(this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }

        System.out.printf("Notificando %s através do e-mail %s usando SMTP: %s - %s\n",
                cliente.getNome(), cliente.getEmail(), this.hostServidorSMTP, mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

    public void setHostServidorSMTP(String hostServidorSMTP) {
        this.hostServidorSMTP = hostServidorSMTP;
    }

}