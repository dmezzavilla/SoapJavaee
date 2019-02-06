package com.soap.repository;

import com.soap.entity.Usuario;

import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
public interface UsuarioRepository {

    void persist(Usuario usuario);

    List<Usuario> findAll();

    Usuario findById(Long id);

    void merge(Usuario usuario);

    void remove(Long id);
}
