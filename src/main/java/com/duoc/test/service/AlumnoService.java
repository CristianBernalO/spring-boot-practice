package com.duoc.test.service;

import com.duoc.test.model.Alumno;
import com.duoc.test.repository.AlumnoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    //Traer todos los alumnos
    public List<Alumno> findAll(){
        return alumnoRepository.findAll();
    };

    public Alumno findById(Integer id){
        return alumnoRepository.findById(id).orElse(null);
    }

    //Borrar por id
    public void delete(Integer id){
        alumnoRepository.deleteById(id);
    }

    public Alumno findByCorreo(String correo){
        return alumnoRepository.findByCorreo(correo);
    }

    public List<Alumno> findByNombre(String nombre){
        return alumnoRepository.findByNombre(nombre);
    }
}
