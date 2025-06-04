package com.example.proyectofinal.controller;

import com.example.proyectofinal.entity.Consulta;
import com.example.proyectofinal.service.ConsultaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/consultas")
public class ConsultaController extends BaseControllerImpl<Consulta, ConsultaServiceImpl> {
}