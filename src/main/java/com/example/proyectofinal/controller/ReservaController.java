package com.example.proyectofinal.controller;

import com.example.proyectofinal.entity.Reserva;
import com.example.proyectofinal.service.ReservaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/reservas")
public class ReservaController extends BaseControllerImpl<Reserva, ReservaServiceImpl> {
}