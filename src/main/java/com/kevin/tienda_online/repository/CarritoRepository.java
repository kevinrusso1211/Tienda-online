package com.kevin.tienda_online.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kevin.tienda_online.model.Carrito;

public interface CarritoRepository extends MongoRepository<Carrito, String> {
    Carrito findByUsuarioId(String usuarioId);
}
