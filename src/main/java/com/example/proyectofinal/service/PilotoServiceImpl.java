package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Piloto;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.PilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotoServiceImpl extends BaseServiceImpl<Piloto, Long> implements PilotoService {
    @Autowired
    private PilotoRepository pilotoRepository;

    public PilotoServiceImpl(BaseRepository<Piloto, Long> baseRepository, PilotoRepository pilotoRepository) {
        super(baseRepository);
        this.pilotoRepository = pilotoRepository;
    }
}
