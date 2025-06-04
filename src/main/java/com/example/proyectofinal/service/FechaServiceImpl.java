package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Fecha;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.FechaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FechaServiceImpl extends BaseServiceImpl<Fecha, Long> implements FechaService {
    @Autowired
    private FechaRepository fechaRepository;

    public FechaServiceImpl(BaseRepository<Fecha, Long> baseRepository, FechaRepository fechaRepository) {
        super(baseRepository);
        this.fechaRepository = fechaRepository;
    }
}
