package com.duoc.test.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Alumno")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(nullable = false, unique = true, length = 50)
    public String rut;

    @Column(nullable = false, length = 50)
    public String nombre;

    @Column(nullable = false, length = 50)
    public String apellido;

    @Column(nullable = false, length = 255)
    public String correo;

    @OneToMany(mappedBy = "alumno")
    public List<Matriculas> matriculas;
}
