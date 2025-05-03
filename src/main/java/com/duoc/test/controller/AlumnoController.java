package com.duoc.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @GetMapping("/api/v1/bienvenida")
    public String bienvenidoAlumno(){

        return "Bienvenido a la página de Alumno";
    }
}
