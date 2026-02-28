package br.com.EuzebioZ.petshop.cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}