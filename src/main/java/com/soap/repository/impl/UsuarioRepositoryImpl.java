package com.soap.repository.impl;

import com.soap.entity.Usuario;
import com.soap.repository.UsuarioRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

public class UsuarioRepositoryImpl implements UsuarioRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public void persist(Usuario usuario) {
        entityManager.persist(usuario);
    }

    @Transactional
    @Override
    public List<Usuario> findAll() {
        TypedQuery<Usuario> query = entityManager.createQuery("from Usuario", Usuario.class);
        return query.getResultList();
    }

    @Transactional
    @Override
    public Usuario findById(Long id) {
        return entityManager.find(Usuario.class, id);
    }

    @Transactional
    @Override
    public void merge(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Transactional
    @Override
    public void remove(Long id) {
        entityManager.remove(entityManager.getReference(Usuario.class, id));
    }
}
