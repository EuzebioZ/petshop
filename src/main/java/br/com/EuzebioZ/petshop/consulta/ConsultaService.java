package br.com.EuzebioZ.petshop.consulta;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService{
    private ConsultaRepository repositorio;

    public ConsultaService(ConsultaRepository repo){
        repositorio = repo;
    }

    public List<ConsultaModel> listar(){
       return repositorio.findAll();
    }
}