package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Tarifa;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryTarifa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarifaServiceImpl extends BaseServiceImpl<Tarifa, Long> implements TarifaService {
    @Autowired
    private RepositoryTarifa repositoryTarifa;

    public TarifaServiceImpl(BaseRepository<Tarifa, Long> baseRepository, RepositoryTarifa repositoryTarifa) {
        super(baseRepository);
        this.repositoryTarifa = repositoryTarifa;
    }
}
