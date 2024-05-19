package com.example.semana4bd.model.service;

import java.util.List;

import com.example.semana4bd.model.entidad.Producto;

public interface IProductoService {
    public String guardarProducto(Producto producto);
    public List<Producto> cargarProductos();
    public String eliminarProducto(Long id);
}
