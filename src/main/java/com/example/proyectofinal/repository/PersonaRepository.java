package com.example.proyectofinal.repository;

import com.example.proyectofinal.model.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
