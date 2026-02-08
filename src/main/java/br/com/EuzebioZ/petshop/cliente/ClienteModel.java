package br.com.EuzebioZ.petshop.cliente;

import br.com.EuzebioZ.petshop.pet.PetModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;
    private String telefone;
    @OneToMany(mappedBy = "dono")
    private List<PetModel> pets;
}