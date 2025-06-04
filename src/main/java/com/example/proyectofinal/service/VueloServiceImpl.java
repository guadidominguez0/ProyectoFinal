package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Vuelo;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueloServiceImpl extends BaseServiceImpl<Vuelo, Long> implements VueloService {
    @Autowired
    private VueloRepository vueloRepository;

    public VueloServiceImpl(BaseRepository<Vuelo, Long> baseRepository, VueloRepository vueloRepository) {
        super(baseRepository);
        this.vueloRepository = vueloRepository;
    }
}
