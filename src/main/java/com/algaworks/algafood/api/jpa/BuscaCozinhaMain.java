package com.algaworks.algafood.api.jpa;

import com.algaworks.algafood.api.AlgafoodApplication;
import com.algaworks.algafood.api.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class BuscaCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext appContext = new SpringApplicationBuilder(AlgafoodApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepository CozinhaRepository = appContext.getBean(CozinhaRepository.class);

        System.out.println(CozinhaRepository.buscar(1L).getNome());
    }
}
