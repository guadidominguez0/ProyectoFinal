package com.example.proyectofinal.controller;

import com.example.proyectofinal.entity.Persona;
import com.example.proyectofinal.service.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
}