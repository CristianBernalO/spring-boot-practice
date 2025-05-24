package com.duoc.test.controller;


import com.duoc.test.model.Alumno;
import com.duoc.test.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("api/v1/alumno/{id}")
    public ResponseEntity<?> getAlumnoById(@PathVariable int id){
        Alumno alumno = alumnoService.findById(id);
        if(null == alumno){
            return ResponseEntity.status(404).body("Alumno no encontrado");
        }
        return ResponseEntity.status(200).body(alumnoService.findById(id));
    }

    @DeleteMapping("/api/v1/borrarAlumno/{id}")
    public ResponseEntity<?> deleteAlumno(@PathVariable Integer id){
        Alumno alumno = alumnoService.findById(id);
        if(null == alumno) {
            return ResponseEntity.status(404).body("Alumno no encontrado");
        }
        alumnoService.delete(id);
        return ResponseEntity.status(200).body("Alumno eliminado");
    }

    @GetMapping("api/v1/alumno/buscar?")
    public ResponseEntity<?> buscarAlumno(@RequestParam String correo){
        return ResponseEntity.status(200).body(alumnoService.findByCorreo(correo));
    }

    @GetMapping("api/v1/buscar/nombre")
    public ResponseEntity<?> buscarNombre(@RequestParam String nombre){
        return ResponseEntity.status(200).body(alumnoService.findByNombre(nombre));
    }

    @PostMapping("api/v1/alumno")
    public ResponseEntity<?> guardarAlumno(@RequestBody Alumno alumno){
        return ResponseEntity.status(201).body(alumnoService.save(alumno));
    }

}
