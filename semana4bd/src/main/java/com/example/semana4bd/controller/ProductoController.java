package com.example.semana4bd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.semana4bd.model.entidad.Producto;
import com.example.semana4bd.model.service.ICategoriaService;
import com.example.semana4bd.model.service.IProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ICategoriaService categoriaService;

    @Autowired
    private IProductoService productoService;
    
    @RequestMapping("/")
    public String inicio(Model model){
        Producto producto = new Producto();
        model.addAttribute("producto", producto);
        model.addAttribute("listaCategorias", categoriaService.cargarOrdenadas());
        model.addAttribute("listaProductos", productoService.cargarProductos());
        return "producto/index";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(Producto producto){
        productoService.guardarProducto(producto);
        return "redirect:/producto/";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id, Model model){
        productoService.eliminarProducto(id);
        return "redirect:/producto/";
    }
}
