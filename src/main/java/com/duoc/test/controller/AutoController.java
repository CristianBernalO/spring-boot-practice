package com.duoc.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {

    @GetMapping("/api/v1/bienvenido")
    public String bienvenidoVehiculo(){

        return "Bienvenido a la página de Vehiculo";
    }

    @GetMapping("/api/v1/vehiculo/{patente}")
    public String buscarVehiculo(@PathVariable String patente){

        return "El vehiculo es " + patente;
    }
}
