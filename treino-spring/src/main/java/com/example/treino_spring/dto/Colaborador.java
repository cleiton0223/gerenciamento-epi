package com.example.treino_spring.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class Colaborador {


    private Long idColaborador;


    @NotBlank(message = "Nome não pode ser nulo")
    @Size(max = 120,message = "Nome não pode ultrapassar os 120 caracteres")
    private String nome;

    @NotBlank
    @Size(message ="CPF não pode ultrapassar os 11 caracteres",max = 11,min = 11)
    private String cpf;

    @NotBlank
    @Size(max = 80,message = "Cargo não pode ultrapassar os 80 caracteres")
    private String cargo;

    @NotBlank
    @Size(max = 80,message = "Setor não pode ultrapassar os 80 caracteres")
    private String setor;

    @NotNull
    @PastOrPresent(message = "Data de admissão não pode ser futura")
    private LocalDate dataadmissao;

    private boolean statusativo;


}
