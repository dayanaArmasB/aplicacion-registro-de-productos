package com.example.semana4bd.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.semana4bd.model.entidad.Categoria;

public interface ICategoriaDAO extends CrudRepository<Categoria, Long> {
    
}