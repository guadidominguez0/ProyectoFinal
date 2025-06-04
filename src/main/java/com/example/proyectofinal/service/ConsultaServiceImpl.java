package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Consulta;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServiceImpl extends BaseServiceImpl<Consulta, Long> implements ConsultaService {
    @Autowired
    private RepositoryConsulta repositoryConsulta;

    public ConsultaServiceImpl(BaseRepository<Consulta, Long> baseRepository, RepositoryConsulta repositoryConsulta) {
        super(baseRepository);
        this.repositoryConsulta = repositoryConsulta;
    }
}
