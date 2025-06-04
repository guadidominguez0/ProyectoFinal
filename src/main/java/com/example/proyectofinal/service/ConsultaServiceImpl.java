package com.example.proyectofinal.service;

import com.example.proyectofinal.model.Consulta;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServiceImpl extends BaseServiceImpl<Consulta, Long> implements ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;

    public ConsultaServiceImpl(BaseRepository<Consulta, Long> baseRepository, ConsultaRepository consultaRepository) {
        super(baseRepository);
        this.consultaRepository = consultaRepository;
    }
}
