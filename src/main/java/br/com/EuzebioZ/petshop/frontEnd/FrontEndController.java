package br.com.EuzebioZ.petshop.frontEnd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontEndController{
    @RequestMapping("/")
    public String home(){
        System.out.println(1);
        return "index";
    }
}
