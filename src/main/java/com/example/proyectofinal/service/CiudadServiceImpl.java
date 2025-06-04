package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Ciudad;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadServiceImpl extends BaseServiceImpl<Ciudad, Long> implements CiudadService {
    @Autowired
    private CiudadRepository ciudadRepository;

    public CiudadServiceImpl(BaseRepository<Ciudad, Long> baseRepository, CiudadRepository ciudadRepository) {
        super(baseRepository);
        this.ciudadRepository = ciudadRepository;
    }
}
