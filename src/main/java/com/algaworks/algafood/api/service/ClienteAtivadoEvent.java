package com.algaworks.algafood.api.service;

import com.algaworks.algafood.api.model.Client;

public class ClienteAtivadoEvent {

    private Client cliente;

    public ClienteAtivadoEvent(Client client) {
        super();
        this.cliente = client;
    }

    public Client getCliente() {
        return cliente;
    }
}
