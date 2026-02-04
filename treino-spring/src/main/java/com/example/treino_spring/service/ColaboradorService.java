package com.example.treino_spring.service;

import com.example.treino_spring.Repository.ColaboradorRepository;
import com.example.treino_spring.dto.ColaboradorDto;
import com.example.treino_spring.entity.Colaborador;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ColaboradorService {

    private final ColaboradorRepository repository;

    public Colaborador cadastrarColaborador(ColaboradorDto colaboradorDto) {

        Colaborador colaborador = new Colaborador();

        colaborador.setNomeColaborador(colaboradorDto.getNome());
        colaborador.setCpf(colaboradorDto.getCpf());
        colaborador.setSetor(colaboradorDto.getSetor());
        colaborador.setDataAdmissao(colaboradorDto.getDataAdmissao());
        colaborador.setStatusAtivo(colaboradorDto.isStatusAtivo());


         return repository.save(colaborador);


    }

}
