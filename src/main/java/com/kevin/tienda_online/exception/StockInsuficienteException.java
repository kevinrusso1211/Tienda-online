package com.kevin.tienda_online.exception;

public class StockInsuficienteException extends RuntimeException{
    public StockInsuficienteException(String mensaje){
        super(mensaje);
    }
}
