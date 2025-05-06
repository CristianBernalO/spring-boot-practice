package com.duoc.test.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Matriculas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matriculas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(nullable = false)
    public Date fecha;

    @ManyToOne
    @JoinColumn(name = "carrera_id")
    private Carreras carreras;

    @ManyToOne
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;
}
