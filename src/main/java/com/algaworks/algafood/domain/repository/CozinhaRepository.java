package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Cozinha;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CozinhaRepository {
    
    List<Cozinha> listar();
    List<Cozinha> listarPorNome(String nome);
    Cozinha buscar(Long id);
    Cozinha salvar(Cozinha cozinha);
    void remover(Cozinha cozinha);

}
