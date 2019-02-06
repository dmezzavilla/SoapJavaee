package com.soap.service;

import com.soap.entity.Usuario;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UsuarioSoapServer {

    @WebMethod(operationName = "persist")
    @WebResult(name = "resultado")
    String persist(@WebParam(name = "nome") String nome,
                   @WebParam(name = "email") String email,
                   @WebParam(name = "telefone") String telefone);

    @WebMethod(operationName = "findAll")
    @WebResult(name = "resultado")
    List<Usuario> findAll();


}
