package br.com.EuzebioZ.petshop.consulta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consulta")
public class ConsultaController{
    @GetMapping("all")
    public String all(){
        return "Consultas";
    }
}