package com.kevin.tienda_online.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kevin.tienda_online.model.Categoria;
import com.kevin.tienda_online.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String> {

    long count();
    long countByStock(Integer stock);

    List<Producto> findByNombreContainingIgnoreCase(String nombre);

    List<Producto> findByCategoriaContainingIgnoreCase(Categoria categoria);

    List<Producto> findByPrecioBetween(BigDecimal precioMin, BigDecimal precioMax);

    List<Producto> findByStockGreaterThan(Integer stock);
}
