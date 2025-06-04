package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Asiento;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryAsiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsientoServiceImpl extends BaseServiceImpl<Asiento, Long> implements AsientoService {
    @Autowired
    private RepositoryAsiento repositoryAsiento;

    public AsientoServiceImpl(BaseRepository<Asiento, Long> baseRepository, RepositoryAsiento repositoryAsiento) {
        super(baseRepository);
        this.repositoryAsiento = repositoryAsiento;
    }
}
