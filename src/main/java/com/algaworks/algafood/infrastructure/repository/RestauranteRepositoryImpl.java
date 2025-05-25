package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepository {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Restaurante> listar() {
        return entityManager.createQuery("from Restaurante r", Restaurante.class).getResultList();
    }

    @Override
    public Restaurante buscar(Long id) {
        return entityManager.find(Restaurante.class, id);
    }

    @Override
    public Restaurante salvar(Restaurante restaurante) {
        return entityManager.merge(restaurante);
    }

    @Override
    public void remover(Restaurante restaurante) {
        restaurante = buscar(restaurante.getId());
        entityManager.remove(restaurante);
    }
}
