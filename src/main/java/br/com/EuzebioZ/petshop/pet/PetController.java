package br.com.EuzebioZ.petshop.pet;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get/{id}")
    public PetModel get(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping("/new")
    public PetModel create(@RequestBody PetModel novo){
        return service.salvar(novo);
    }

    @PutMapping("/update/{id}")
    public PetModel update(@PathVariable Long id, @RequestBody PetModel novo){
        return service.alterar(id,novo);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Long id){
        return service.deletar(id);
    }
}