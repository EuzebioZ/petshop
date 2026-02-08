package br.com.EuzebioZ.petshop.pet;

import br.com.EuzebioZ.petshop.cliente.ClienteModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pet")
public class PetModel{
    private String nome;
    private int idade;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "dono")
    private ClienteModel dono;
}