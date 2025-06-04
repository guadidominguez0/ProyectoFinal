package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Reserva;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl extends BaseServiceImpl<Reserva, Long> implements ReservaService {
    @Autowired
    private RepositoryReserva repositoryReserva;

    public ReservaServiceImpl(BaseRepository<Reserva, Long> baseRepository, RepositoryReserva repositoryReserva) {
        super(baseRepository);
        this.repositoryReserva = repositoryReserva;
    }
}
