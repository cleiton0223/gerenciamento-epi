package com.example.treino_spring.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Epi {

    private Long idEpi;

    @NotBlank(message = "Nome não pode ser nulo")
    @Size(max = 120,message ="Nome não pode ultrapassar os 120 caracteres")
    private String nome;

    @NotBlank
    @Size(max = 80,message = "O tipo de epi não pode ultrapassar os 80 caracteres")
    private String tipoEpi;

    @NotNull
    @Size(max = 255,message = "A descrição não pode ultrapassar os 255 caracteres")
    private String descricao;

    @NotBlank
    @Size(max = 20,message = "Tamanho não pode ultrapassar os 20 caracteres")
    private String tamanho;

    private LocalDate validade;

    @NotBlank
    @Size(max = 20,message = "Situação não pode ultrapssar os 20 caracteres")
    private String situacao;

}
