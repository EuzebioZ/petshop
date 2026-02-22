package br.com.EuzebioZ.petshop.pet;

import br.com.EuzebioZ.petshop.cliente.ClienteModel;
import br.com.EuzebioZ.petshop.consulta.ConsultaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pet")
public class PetModel{
    private String nome;
    private int idade;
    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "dono")
    private ClienteModel dono;
    @OneToMany(mappedBy = "pet")
    private List<ConsultaModel> consultas;
}