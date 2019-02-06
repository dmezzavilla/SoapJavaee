package com.soap.service.impl;

import com.soap.entity.Usuario;
import com.soap.repository.UsuarioRepository;
import com.soap.service.UsuarioSoapServer;

import javax.inject.Inject;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
@WebService(name = "UsuarioServer")
public class UsuarioSoapServerImpl implements UsuarioSoapServer {

    @Inject
    UsuarioRepository usuarioRepository;


    @Override
    public String persist(String nome, String email, String telefone) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setTelefone(telefone);

        usuarioRepository.persist(usuario);

        return "Usuário cadastrado com sucesso!";
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public String remove(Long id) {
        usuarioRepository.remove(id);
        return "Usuário removido com sucesso!";
    }

    @Override
    public String merge(Long id, String nome, String email, String telefone) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setTelefone(telefone);

        usuarioRepository.merge(usuario);
        return "Usuário atualizado com sucesso!";
    }


}
