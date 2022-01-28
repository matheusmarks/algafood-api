package com.algaworks.algafood.api.config;

import com.algaworks.algafood.api.notificator.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.algaworks.com.br");
        notificador.setCaixaAlta(true);
        return notificador;
    }

}
