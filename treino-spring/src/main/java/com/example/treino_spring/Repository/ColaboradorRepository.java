package com.example.treino_spring.Repository;

import com.example.treino_spring.entity.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository<Colaborador,Long> {
}
