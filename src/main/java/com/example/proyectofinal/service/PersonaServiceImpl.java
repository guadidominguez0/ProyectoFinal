package com.example.proyectofinal.service;

import com.example.proyectofinal.entity.Persona;
import com.example.proyectofinal.repository.BaseRepository;
import com.example.proyectofinal.repository.RepositoryPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {
    @Autowired
    private RepositoryPersona repositoryPersona;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, RepositoryPersona repositoryPersona) {
        super(baseRepository);
        this.repositoryPersona = repositoryPersona;
    }
}
