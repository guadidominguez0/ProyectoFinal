package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Pago;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoServiceImpl extends BaseServiceImpl<Pago, Long> implements PagoService {
    @Autowired
    private RepositoryPago repositoryPago;

    public PagoServiceImpl(BaseRepository<Pago, Long> baseRepository, RepositoryPago repositoryPago) {
        super(baseRepository);
        this.repositoryPago = repositoryPago;
    }
}
