package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Pago;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoServiceImpl extends BaseServiceImpl<Pago, Long> implements PagoService {
    @Autowired
    private PagoRepository pagoRepository;

    public PagoServiceImpl(BaseRepository<Pago, Long> baseRepository, PagoRepository pagoRepository) {
        super(baseRepository);
        this.pagoRepository = pagoRepository;
    }
}
