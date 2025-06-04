package com.example.proyectofinal.repository;

import com.example.proyectofinal.entity.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsuario extends BaseRepository<Usuario, Long> {
}
