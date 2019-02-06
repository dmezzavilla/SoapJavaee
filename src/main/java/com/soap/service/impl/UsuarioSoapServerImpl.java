package com.soap.service.impl;

import com.soap.entity.Usuario;
import com.soap.repository.UsuarioRepository;
import com.soap.service.UsuarioSoapServer;

import javax.inject.Inject;
import javax.jws.WebService;
import java.util.List;

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


}
