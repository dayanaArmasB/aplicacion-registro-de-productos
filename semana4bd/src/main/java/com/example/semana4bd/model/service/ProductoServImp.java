package com.example.semana4bd.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.semana4bd.model.dao.IProductoDAO;
import com.example.semana4bd.model.entidad.Producto;

@Service
public class ProductoServImp implements IProductoService {
    @Autowired
    private IProductoDAO productoDAO;

    @Override
    public String guardarProducto(Producto producto) {
        productoDAO.save(producto);
        return "Se registró correctamente el producto";
    }

    @Override
    public List<Producto> cargarProductos() {
        return productoDAO.findAllByOrderByNombreAsc();
    }

    @Override
    public String eliminarProducto(Long id) {
        productoDAO.deleteById(id);
        return "Se eliminó el producto";
    }
}
