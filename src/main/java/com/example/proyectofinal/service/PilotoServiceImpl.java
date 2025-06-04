package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Piloto;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryPiloto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotoServiceImpl extends BaseServiceImpl<Piloto, Long> implements PilotoService {
    @Autowired
    private RepositoryPiloto repositoryPiloto;

    public PilotoServiceImpl(BaseRepository<Piloto, Long> baseRepository, RepositoryPiloto repositoryPiloto) {
        super(baseRepository);
        this.repositoryPiloto = repositoryPiloto;
    }
}
