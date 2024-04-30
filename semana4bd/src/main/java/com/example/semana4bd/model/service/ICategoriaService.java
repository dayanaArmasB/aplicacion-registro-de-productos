package com.example.semana4bd.model.service;

import java.util.List;

import com.example.semana4bd.model.entidad.Categoria;


public interface ICategoriaService {
    public String guardarCategoria(Categoria categoria);
    public List<Categoria> cargarCategorias();
    public String eliminarCategoria(Long id);
}

