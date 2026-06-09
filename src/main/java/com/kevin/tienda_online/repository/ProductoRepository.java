package com.kevin.tienda_online.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kevin.tienda_online.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String> {

}
