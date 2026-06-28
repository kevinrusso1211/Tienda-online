package com.kevin.tienda_online.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "pedidos")
@Getter
@Setter
public class Pedido {
    @Id
    private String id;
    private String usuarioId;
    private List<PedidoItem> items;
    private BigDecimal total;
    private LocalDateTime fecha;
    private EstadoPedido estado;
}
