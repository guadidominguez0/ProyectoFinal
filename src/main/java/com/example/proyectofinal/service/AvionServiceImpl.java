package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Avion;
import com.example.proyectofinal.repository.AvionRepository;
import com.example.proyectofinal.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvionServiceImpl extends BaseServiceImpl<Avion, Long> implements AvionService {
    @Autowired
    private AvionRepository avionRepository;

    public AvionServiceImpl(BaseRepository<Avion, Long> baseRepository, AvionRepository avionRepository) {
        super(baseRepository);
        this.avionRepository = avionRepository;
    }
}
