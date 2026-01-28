package com.example.treino_spring.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "epi")

public class Epi {

    @Id
    @Column(name = "id_epi")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_epi",unique = true,nullable = false)
    private String nomeEpi;

    @Column(name = "tipo_epi",nullable = false)
    private String tipoEpi;

    @Column(length = 255,nullable = false)
    private String descricao;

    @Column(length = 20,nullable = false)
    private String tamanho;

    private LocalDate validade;

    @Column(nullable = false)
    private String situacao;


}
