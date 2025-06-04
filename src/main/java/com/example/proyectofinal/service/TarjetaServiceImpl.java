package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Tarjeta;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryTarjeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarjetaServiceImpl extends BaseServiceImpl<Tarjeta, Long> implements TarjetaService {
    @Autowired
    private RepositoryTarjeta repositoryTarjeta;

    public TarjetaServiceImpl(BaseRepository<Tarjeta, Long> baseRepository, RepositoryTarjeta repositoryTarjeta) {
        super(baseRepository);
        this.repositoryTarjeta = repositoryTarjeta;
    }
}
