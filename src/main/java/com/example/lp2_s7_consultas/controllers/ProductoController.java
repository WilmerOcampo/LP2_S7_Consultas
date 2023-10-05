package com.example.lp2_s7_consultas.controllers;

import com.example.lp2_s7_consultas.entities.Producto;
import com.example.lp2_s7_consultas.repositories.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductoController {
    @Autowired
    private IProductoRepository repos;

    @GetMapping("/search")
    public String searchProdDescription(@RequestParam(name = "desc", required = false) String desc, Model model) {
        if (desc != null && !desc.isEmpty()) {
            List<Producto> p = repos.searchForDescription(desc);
            model.addAttribute("products", p);
        }
        return "products";
    }
}
