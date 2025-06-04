package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Tarjeta;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.TarjetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarjetaServiceImpl extends BaseServiceImpl<Tarjeta, Long> implements TarjetaService {
    @Autowired
    private TarjetaRepository tarjetaRepository;

    public TarjetaServiceImpl(BaseRepository<Tarjeta, Long> baseRepository, TarjetaRepository tarjetaRepository) {
        super(baseRepository);
        this.tarjetaRepository = tarjetaRepository;
    }
}
