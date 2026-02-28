package br.com.EuzebioZ.petshop.consulta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("consulta")
public class ConsultaController{
    private ConsultaService service;

    public ConsultaController(ConsultaService service){
        this.service = service;
    }

    @GetMapping("/all")
    public List<ConsultaModel> all(){
        return service.listar();
    }
}