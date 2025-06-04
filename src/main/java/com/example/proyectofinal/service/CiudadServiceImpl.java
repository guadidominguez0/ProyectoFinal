package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Ciudad;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryCiudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadServiceImpl extends BaseServiceImpl<Ciudad, Long> implements CiudadService {
    @Autowired
    private RepositoryCiudad repositoryCiudad;

    public CiudadServiceImpl(BaseRepository<Ciudad, Long> baseRepository, RepositoryCiudad repositoryCiudad) {
        super(baseRepository);
        this.repositoryCiudad = repositoryCiudad;
    }
}
