package com.algaworks.algafood.api.notificator;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {

    /**
     * Host do servidor de e-mail
     */
    private String hostServidor;

    /**
     * Porta do servidor de e-mail
     */
    private Integer portaServidor;

    /**
     *
     * @return hostServidor
     */
    public String getHostServidor() {
        return hostServidor;
    }

    /**
     *
     * @param hostServidor
     */
    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }

    /**
     *
     * @return portaServidor
     */
    public Integer getPortaServidor() {
        return portaServidor;
    }

    /**
     *
     * @param portaServidor
     */
    public void setPortaServidor(Integer portaServidor) {
        this.portaServidor = portaServidor;
    }
}
