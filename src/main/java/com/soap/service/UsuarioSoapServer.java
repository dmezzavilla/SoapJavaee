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

    @WebMethod(operationName = "findById")
    @WebResult(name = "resultado")
    Usuario findById(@WebParam(name = "id") Long id);

    @WebMethod(operationName = "remove")
    @WebResult(name = "resultado")
    String remove(@WebParam(name = "id") Long id);

    @WebMethod(operationName = "merge")
    @WebResult(name = "resultado")
    String merge(@WebParam(name = "id") Long id,
                 @WebParam(name = "nome") String nome,
                 @WebParam(name = "email") String email,
                 @WebParam(name = "telefone") String telefone);


}
