package com.kevin.tienda_online.exception;

public class EstadoPedidoInvalidoException extends RuntimeException{
    public EstadoPedidoInvalidoException(String mensaje){
        super(mensaje);
    }
}
