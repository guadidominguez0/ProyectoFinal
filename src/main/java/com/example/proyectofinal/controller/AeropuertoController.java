package com.example.proyectofinal.controller;

import com.example.proyectofinal.entity.Aeropuerto;
import com.example.proyectofinal.service.AeropuertoServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/aeropuertos")
public class AeropuertoController extends BaseControllerImpl<Aeropuerto, AeropuertoServiceImpl> {
}