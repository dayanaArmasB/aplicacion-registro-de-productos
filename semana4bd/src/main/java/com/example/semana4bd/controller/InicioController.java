package com.example.semana4bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.semana4bd.model.entidad.Categoria;
import com.example.semana4bd.model.service.ICategoriaService;

@Controller
public class InicioController {
    
    @Autowired
    private ICategoriaService categoriaService;
    
    @RequestMapping("/")
    public String inicio(Model model){
        Categoria categoria = new Categoria();
        model.addAttribute("categoria", categoria);
        model.addAttribute("listaCategorias", categoriaService.cargarCategorias());
        return "inicio";
    }

    @RequestMapping(value = "/formulario", method = RequestMethod.POST)
    public String guardar(Categoria categoria){
        categoriaService.guardarCategoria(categoria);
        return "redirect:/";
    }
}
