package br.com.EuzebioZ.petshop.cliente;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController{
    private ClienteService service;

    public ClienteController(ClienteService service){ this.service = service;}
    
    @GetMapping("/all")
    public List<ClienteModel> all(){
        return service.listar();
    }

    @GetMapping("/get/{id}")
    public ClienteModel get(@PathVariable Long id){ return service.buscarPorId(id); }

    @PostMapping("/new")
    public ClienteModel criar(@RequestBody ClienteModel cliente){ return service.salvar(cliente); }

    @PutMapping("/update/{id}")
    public ClienteModel update(@PathVariable Long id, @RequestBody ClienteModel novoCliente){
        return service.alterar(id,novoCliente);
    }

    @DeleteMapping("/delete/{id}")
    public boolean remover(@PathVariable Long id){
        return service.deletar(id);
    }
}