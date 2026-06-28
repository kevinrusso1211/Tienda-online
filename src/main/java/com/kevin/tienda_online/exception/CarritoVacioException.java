package com.kevin.tienda_online.exception;

public class CarritoVacioException extends RuntimeException{
    public CarritoVacioException(String mensajes){
        super(mensajes);
    }
}
