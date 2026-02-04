package com.example.treino_spring.controller;


import com.example.treino_spring.dto.ColaboradorDto;
import com.example.treino_spring.entity.Colaborador;
import com.example.treino_spring.service.ColaboradorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colaboradores")
@RequiredArgsConstructor
public class ColaboradorController {

    private final ColaboradorService colaboradorService;

    @PostMapping
    public Colaborador cadastrarColaborador(@RequestBody ColaboradorDto colaboradorDto){

        Colaborador colaborador = new Colaborador();

        colaborador.setNomeColaborador(colaboradorDto.getNome());
        colaboradorDto.setCpf(colaboradorDto.getCpf());
        colaboradorDto.setSetor(colaboradorDto.getSetor());
        colaboradorDto.setDataAdmissao(colaboradorDto.getDataAdmissao());
        colaboradorDto.setStatusAtivo(colaboradorDto.isStatusAtivo());



        return  colaboradorService.cadastrarColaborador(colaboradorDto);
    }
    
}
