package com.algaworks.algafood.api.service;

import com.algaworks.algafood.api.model.Client;
import com.algaworks.algafood.api.notificator.Notificador;


public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
        System.out.println("AtivaçãoClienteService: " + notificador);
    }

    public void ativar(Client cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
