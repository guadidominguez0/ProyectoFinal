package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Fecha;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryFecha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FechaServiceImpl extends BaseServiceImpl<Fecha, Long> implements FechaService {
    @Autowired
    private RepositoryFecha repositoryFecha;

    public FechaServiceImpl(BaseRepository<Fecha, Long> baseRepository, RepositoryFecha repositoryFecha) {
        super(baseRepository);
        this.repositoryFecha = repositoryFecha;
    }
}
