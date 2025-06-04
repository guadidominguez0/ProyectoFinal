package com.example.proyectofinal.controller;

import com.example.proyectofinal.model.Ciudad;
import com.example.proyectofinal.service.CiudadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/ciudades")
public class CiudadController extends BaseControllerImpl<Ciudad, CiudadServiceImpl> {
}