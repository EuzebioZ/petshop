package br.com.EuzebioZ.petshop.pet;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService{
    private PetRepository repositorio;

    public PetService(PetRepository repositorio){ this.repositorio = repositorio;}

    public List<PetModel> listar(){
        return this.repositorio.findAll();
    }

    public PetModel buscarPorId(Long id){
        Optional<PetModel> resposta = repositorio.findById(id);
        return resposta.isEmpty()? null : resposta.get();
    }

    public boolean deletar(Long id){
        if(repositorio.existsById(id))
            repositorio.deleteById(id);
        else
            return false;

        return true;
    }

    public PetModel salvar(PetModel pet){
        return repositorio.save(pet);
    }

    public PetModel alterar(Long id, PetModel novo){
        if(repositorio.existsById(id))
            return repositorio.save(novo);
        else
            return null;
    }
}