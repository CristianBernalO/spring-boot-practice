package com.duoc.test.controller;


import com.duoc.test.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/api/v1/bienvenida")
    public String bienvenidoAlumno(){

        return "Bienvenido a la página de Alumno";
    }

    @GetMapping("/api/v1/alumnos")
    public ResponseEntity<?> getAlumnos(){
        return ResponseEntity.status(200).body(alumnoService.findAll());
    }
}
