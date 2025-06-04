package com.example.proyectofinal.controller;

import com.example.proyectofinal.model.Pago;
import com.example.proyectofinal.service.PagoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/pagos")
public class PagoController extends BaseControllerImpl<Pago, PagoServiceImpl> {
}