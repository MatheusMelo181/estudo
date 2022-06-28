package com.loja.vendas.service;

import com.loja.vendas.model.ClienteModel;
import com.loja.vendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository repository;

    @Autowired
    private ClienteService(ClienteRepository repository){
        this.repository = repository;
    }
    public void salvarCliente(ClienteModel clienteModel){
        validarCliente(clienteModel);
        this.repository.persistir(clienteModel);
    }

    public void validarCliente(ClienteModel clienteModel){

    }
}
