package com.example.proyectofinal.repository;

import com.example.proyectofinal.model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
}
