package com.algaworks.algafood.api.jpa;

import com.algaworks.algafood.api.AlgafoodApplication;
import com.algaworks.algafood.api.domain.model.Cozinha;
import com.algaworks.algafood.api.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class InclusaoCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext appContext = new SpringApplicationBuilder(AlgafoodApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepository CozinhaRepository = appContext.getBean(CozinhaRepository.class);

       Cozinha c1 = new Cozinha();
       c1.setNome("Brasileira");

       Cozinha c2 = new Cozinha();
       c2.setNome("Japonesa");

       System.out.println(CozinhaRepository.salvar(c1));
       System.out.println(CozinhaRepository.salvar(c2));
    }
}
