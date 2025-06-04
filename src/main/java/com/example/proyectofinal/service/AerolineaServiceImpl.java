package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Aerolinea;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryAerolinea;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AerolineaServiceImpl extends BaseServiceImpl<Aerolinea, Long> implements AerolineaService {
    @Autowired
    private RepositoryAerolinea repositoryAerolinea;

    public AerolineaServiceImpl(BaseRepository<Aerolinea, Long> baseRepository, RepositoryAerolinea repositoryAerolinea) {
        super(baseRepository);
        this.repositoryAerolinea = repositoryAerolinea;
    }
}
