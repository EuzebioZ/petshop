package br.com.EuzebioZ.petshop.cliente;

import br.com.EuzebioZ.petshop.pet.PetModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String cpf;
    private String nome;
    private String telefone;
    @JsonIgnore
    @OneToMany(mappedBy = "dono")
    private List<PetModel> pets;
}