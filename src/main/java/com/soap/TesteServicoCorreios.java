package com.soap;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteProxy;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;

import java.rmi.RemoteException;

/**
 * @author Daniel Mezzavilla
 */
public class TesteServicoCorreios {
    public static void main(String[] args) {

        AtendeClienteProxy consulta = new AtendeClienteProxy();

        try {
            EnderecoERP endereco = consulta.consultaCEP("22230001");

            System.out.println(endereco.getEnd());
            System.out.println(endereco.getBairro());
            System.out.println(endereco.getCidade());
            System.out.println(endereco.getUf());

        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
