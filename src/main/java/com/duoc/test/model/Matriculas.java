package com.duoc.test.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Matriculas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matriculas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
}
