package com.example.proyectofinal.controller;

import com.example.proyectofinal.model.Tarifa;
import com.example.proyectofinal.service.TarifaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/tarifas")
public class TarifaController extends BaseControllerImpl<Tarifa, TarifaServiceImpl> {
}