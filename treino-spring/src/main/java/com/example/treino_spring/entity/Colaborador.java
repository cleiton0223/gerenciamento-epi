package com.example.treino_spring.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Entity
@Table(name = "colaborador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Colaborador {

    @Id
    @Column(name = "id_colaborador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome",unique = true,nullable = false)
    private String nomeColaborador;

    @Column(name = "cpf",unique = true)
    private String cpf;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "setor")
    private String setor;


    @Column(name = "data_admissao")
    private LocalDate dataAdmissao;

    @Column(name = "status_ativo")
    private boolean statusAtivo;

}
