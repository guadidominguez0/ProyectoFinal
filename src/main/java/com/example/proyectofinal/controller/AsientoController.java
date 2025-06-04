package com.example.proyectofinal.controller;

import com.example.proyectofinal.model.Asiento;
import com.example.proyectofinal.service.AsientoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/asientos")
public class AsientoController extends BaseControllerImpl<Asiento, AsientoServiceImpl> {
}