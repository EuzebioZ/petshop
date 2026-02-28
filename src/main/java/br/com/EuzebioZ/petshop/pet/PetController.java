package br.com.EuzebioZ.petshop.pet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("pet")
@RestController
public class PetController{
    private PetService service;

    public PetController(PetService service){
        this.service = service;
    }

    @GetMapping("/all")
    public List<PetModel> all(){
        return service.listar();
    }
}