package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Aeropuerto;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryAeropuerto;
import org.hibernate.envers.Audited;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AeropuertoServiceImpl extends BaseServiceImpl<Aeropuerto, Long> implements AeropuertoService {
    @Autowired
    private RepositoryAeropuerto repositoryAeropuerto;

    public AeropuertoServiceImpl(BaseRepository<Aeropuerto, Long> baseRepository, RepositoryAeropuerto repositoryAeropuerto) {
        super(baseRepository);
        this.repositoryAeropuerto = repositoryAeropuerto;
    }
}
