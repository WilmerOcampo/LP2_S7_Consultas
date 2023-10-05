package com.example.lp2_s7_consultas.repositories;

import com.example.lp2_s7_consultas.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {
    @Query("SELECT p FROM Producto p WHERE LOWER(p.descripcion) LIKE %:descripcion%")
    List<Producto> searchForDescription(@Param("descripcion") String desc);
}
