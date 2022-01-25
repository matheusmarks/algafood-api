package com.algaworks.algafood.api.notificator;

import com.algaworks.algafood.api.model.Client;

public interface Notificador {

    public void notificar(Client cliente, String mensagem);
}
