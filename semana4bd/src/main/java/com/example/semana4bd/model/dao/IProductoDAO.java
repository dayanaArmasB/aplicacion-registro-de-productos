package com.example.semana4bd.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.semana4bd.model.entidad.Producto;

public interface IProductoDAO extends CrudRepository<Producto,Long> {
    
    public List<Producto> findAllByOrderByNombreAsc();
}
    

