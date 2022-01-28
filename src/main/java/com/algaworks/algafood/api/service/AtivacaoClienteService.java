package com.algaworks.algafood.api.service;

import com.algaworks.algafood.api.model.Client;
import com.algaworks.algafood.api.notificator.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(Client cliente) {
        cliente.ativar();

        if (notificador != null) {
                notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        } else {
            System.out.println("Não foi possível notificar, porém seu cadastro está ativo !");
        }
    }

}
