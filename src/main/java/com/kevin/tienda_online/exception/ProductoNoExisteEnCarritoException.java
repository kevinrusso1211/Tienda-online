package com.kevin.tienda_online.exception;

public class ProductoNoExisteEnCarritoException extends RuntimeException{
    public ProductoNoExisteEnCarritoException(String mensaje){
        super(mensaje);
    }
}
