package br.com.EuzebioZ.petshop.consulta;

import br.com.EuzebioZ.petshop.pet.PetModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="consulta")
public class ConsultaModel{
    private LocalDateTime data_hora;
    private String descricao;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "pet")
    private PetModel pet;
}