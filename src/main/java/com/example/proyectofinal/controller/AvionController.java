package com.example.proyectofinal.controller;

import com.example.proyectofinal.model.Avion;
import com.example.proyectofinal.service.AvionServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/aviones")
public class AvionController extends BaseControllerImpl<Avion, AvionServiceImpl> {
}