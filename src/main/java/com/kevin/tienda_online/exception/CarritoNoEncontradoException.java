package com.kevin.tienda_online.exception;

public class CarritoNoEncontradoException extends RuntimeException{
    public CarritoNoEncontradoException(String mensaje){
        super(mensaje);
    }
}
