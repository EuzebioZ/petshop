package br.com.EuzebioZ.petshop.cliente;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService{
    private ClienteRepository repositorio;

    public ClienteService(ClienteRepository repostorio){
        this.repositorio = repostorio;
    }

    public List<ClienteModel> listar(){return repositorio.findAll();}

    public ClienteModel buscarPorId(Long id){
        Optional<ClienteModel> resposta = repositorio.findById(id);
        return resposta.isEmpty()? null : resposta.get();
    }

    public ClienteModel salvar(ClienteModel cliente){ return repositorio.save(cliente); }

    public ClienteModel alterar(Long id, ClienteModel novoCliente){
        if (repositorio.existsById(id))
            return repositorio.save(novoCliente);
        else
            return null;
    }

    public boolean deletar(Long id){
        if(repositorio.existsById(id))
            repositorio.deleteById(id);
        else
            return false;

        return true;
    }
}