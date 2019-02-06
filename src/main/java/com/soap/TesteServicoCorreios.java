package com.soap;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteProxy;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;

import java.rmi.RemoteException;

public class TesteServicoCorreios {
    public static void main(String[] args) {

        AtendeClienteProxy a = new AtendeClienteProxy();
        try {
            EnderecoERP consultaCep = a.consultaCEP("22230001");

            System.out.println(consultaCep.getEnd());
            System.out.println(consultaCep.getBairro());
            System.out.println(consultaCep.getCidade());
            System.out.println(consultaCep.getUf());

        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
