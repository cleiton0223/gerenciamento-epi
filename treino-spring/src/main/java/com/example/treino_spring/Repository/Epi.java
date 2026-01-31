package com.example.treino_spring.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Epi extends JpaRepository<Epi,Long> {
}
