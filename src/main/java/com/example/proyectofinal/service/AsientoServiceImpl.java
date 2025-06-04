package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Asiento;
import com.example.proyectofinal.repository.AsientoRepository;
import com.example.proyectofinal.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsientoServiceImpl extends BaseServiceImpl<Asiento, Long> implements AsientoService {
    @Autowired
    private AsientoRepository asientoRepository;

    public AsientoServiceImpl(BaseRepository<Asiento, Long> baseRepository, AsientoRepository asientoRepository) {
        super(baseRepository);
        this.asientoRepository = asientoRepository;
    }
}
