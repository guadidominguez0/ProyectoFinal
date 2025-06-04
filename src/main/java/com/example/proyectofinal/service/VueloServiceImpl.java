package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Vuelo;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryVuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueloServiceImpl extends BaseServiceImpl<Vuelo, Long> implements VueloService {
    @Autowired
    private RepositoryVuelo repositoryVuelo;

    public VueloServiceImpl(BaseRepository<Vuelo, Long> baseRepository, RepositoryVuelo repositoryVuelo) {
        super(baseRepository);
        this.repositoryVuelo = repositoryVuelo;
    }
}
