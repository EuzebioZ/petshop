package br.com.EuzebioZ.petshop.cliente;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService{
    private ClienteRepository repositorio;

    public ClienteService(ClienteRepository repostorio){
        this.repositorio = repostorio;
    }

    public List<ClienteModel> listar(){return repositorio.findAll();}
}