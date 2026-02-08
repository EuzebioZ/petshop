package br.com.EuzebioZ.petshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@SpringBootApplication
@RequestMapping
@RestController
public class PetshopApplication {

	public static void main(String[] args){SpringApplication.run(PetshopApplication.class, args);}

	@CrossOrigin
	@GetMapping("/hora")
	public LocalTime sucesso(){ return LocalTime.now();}
}