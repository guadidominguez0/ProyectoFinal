package com.example.proyectofinal.controller;

import com.example.proyectofinal.entity.Aerolinea;
import com.example.proyectofinal.service.AerolineaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/aerolineas")
public class AerolineaController extends BaseControllerImpl<Aerolinea, AerolineaServiceImpl> {
}
