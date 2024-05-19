package com.example.semana4bd.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.semana4bd.model.dao.ICategoriaDAO;
import com.example.semana4bd.model.entidad.Categoria;


@Service
public class CategoriaServImp implements ICategoriaService {

    @Autowired
    private ICategoriaDAO categoriaDAO;

    @Override
    public String guardarCategoria(Categoria categoria) {
        categoriaDAO.save(categoria);
        return "La categoría se guardo correctamente";
    }

    @Override
    public List<Categoria> cargarCategorias() {
        return (List<Categoria>)categoriaDAO.findAll();
    }

    @Override
    public String eliminarCategoria(Long id) {
       categoriaDAO.deleteById(id);
       return "categoria fue eliminada";
    }

    @Override
    public List<Categoria> cargarOrdenadas() {
        return categoriaDAO.findAllByOrderByNombreAsc();
    }

    @Override
    public List<Categoria> cargarLike(String p) {
        return categoriaDAO.cualquierNombre(p);
    }
    
}
