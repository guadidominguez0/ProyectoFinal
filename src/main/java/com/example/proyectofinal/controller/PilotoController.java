package com.example.proyectofinal.controller;

import com.example.proyectofinal.entity.Piloto;
import com.example.proyectofinal.service.PilotoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/pilotos")
public class PilotoController extends BaseControllerImpl<Piloto, PilotoServiceImpl> {
}