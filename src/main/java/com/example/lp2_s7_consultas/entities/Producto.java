package com.example.lp2_s7_consultas.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_productos")
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;
}
