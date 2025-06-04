package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Usuario;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService {
    @Autowired
    private RepositoryUsuario repositoryUsuario;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository, RepositoryUsuario repositoryUsuario) {
        super(baseRepository);
        this.repositoryUsuario = repositoryUsuario;
    }
}
