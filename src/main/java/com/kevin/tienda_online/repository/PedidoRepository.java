package com.kevin.tienda_online.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kevin.tienda_online.model.EstadoPedido;
import com.kevin.tienda_online.model.Pedido;

public interface PedidoRepository extends MongoRepository<Pedido, String>{
    List<Pedido> findByUsuarioId(String usuarioId);
    long count();
    long countByEstado(EstadoPedido estado);
}
