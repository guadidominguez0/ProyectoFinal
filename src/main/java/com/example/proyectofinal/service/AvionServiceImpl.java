package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Avion;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryAvion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvionServiceImpl extends BaseServiceImpl<Avion, Long> implements AvionService {
    @Autowired
    private RepositoryAvion repositoryAvion;

    public AvionServiceImpl(BaseRepository<Avion, Long> baseRepository, RepositoryAvion repositoryAvion) {
        super(baseRepository);
        this.repositoryAvion = repositoryAvion;
    }
}
