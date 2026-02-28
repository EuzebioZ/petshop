package br.com.EuzebioZ.petshop.pet;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService{
    private PetRepository repositorio;

    public PetService(PetRepository repositorio){ this.repositorio = repositorio;}

    public List<PetModel> listar(){
        return this.repositorio.findAll();
    }
}