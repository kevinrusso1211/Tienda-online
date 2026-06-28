package com.kevin.tienda_online.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kevin.tienda_online.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String> {

    long count();
    long countByStock(Integer stock);

    List<Producto> findByNombreContainingIgnoreCase(String nombre);
}
