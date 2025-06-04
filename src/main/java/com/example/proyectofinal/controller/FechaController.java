package com.example.proyectofinal.controller;

import com.example.proyectofinal.model.Fecha;
import com.example.proyectofinal.service.FechaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/fechas")
public class FechaController extends BaseControllerImpl<Fecha, FechaServiceImpl> {
}