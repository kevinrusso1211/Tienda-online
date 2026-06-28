package com.kevin.tienda_online.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoItem {
    private String productoId;
    private String nombreProducto;
    private BigDecimal precio;
    private Integer cantidad;
}
