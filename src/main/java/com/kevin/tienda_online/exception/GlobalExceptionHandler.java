package com.kevin.tienda_online.exception;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UsuarioNoEncontradoException.class)
    public ResponseEntity<ErrorResponse> manejarUsuarioNoEncontrado(UsuarioNoEncontradoException ex) {
        ErrorResponse error = new ErrorResponse(
            ex.getMessage(),
            404,
            LocalDateTime.now()
        );

        return ResponseEntity.status(404).body(error);
    }

    @ExceptionHandler(CredencialesInvalidasException.class)
    public ResponseEntity<ErrorResponse> manejarCredencialesInvalidas(CredencialesInvalidasException ex) {
        ErrorResponse error = new ErrorResponse(
            ex.getMessage(),
            401,
            LocalDateTime.now()
        );

        return ResponseEntity.status(401).body(error);
    }

    @ExceptionHandler(ProductoNoEncontradoException.class)
    public ResponseEntity<ErrorResponse> manejarProductoNoEncontrado(ProductoNoEncontradoException ex) {
        ErrorResponse error = new ErrorResponse(
            ex.getMessage(),
            404,
            LocalDateTime.now()
        );

        return ResponseEntity.status(404).body(error);
    }

    @ExceptionHandler(UsuarioYaExisteException.class)
    public ResponseEntity<ErrorResponse> manejarUsuarioYaExiste(UsuarioYaExisteException ex) {
        ErrorResponse error = new ErrorResponse(
            ex.getMessage(),
            409,
            LocalDateTime.now()
        );

        return ResponseEntity.status(409).body(error);
    }

    @ExceptionHandler(CantidadInvalidaException.class)
    public ResponseEntity<ErrorResponse> manejarCantidadInvalida(CantidadInvalidaException ex) {
        ErrorResponse error = new ErrorResponse(
                ex.getMessage(),
                400,
                LocalDateTime.now()
        );

        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(StockInsuficienteException.class)
    public ResponseEntity<ErrorResponse> manejarStockInsuficiente(StockInsuficienteException ex) {
        ErrorResponse error = new ErrorResponse(
                ex.getMessage(),
                400,
                LocalDateTime.now()
        );

        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(CarritoNoEncontradoException.class)
    public ResponseEntity<ErrorResponse> manejarCarritoNoEncontrado(CarritoNoEncontradoException ex) {
        ErrorResponse error = new ErrorResponse(
                ex.getMessage(),
                404,
                LocalDateTime.now()
        );

        return ResponseEntity.status(404).body(error);
    }

    @ExceptionHandler(ProductoNoExisteEnCarritoException.class)
    public ResponseEntity<ErrorResponse> manejarProductoNoExisteEnCarrito(
            ProductoNoExisteEnCarritoException ex) {

        ErrorResponse error = new ErrorResponse(
                ex.getMessage(),
                404,
                LocalDateTime.now()
        );

        return ResponseEntity.status(404).body(error);
    }

    @ExceptionHandler(PedidoNoEncontradoException.class)
    public ResponseEntity<ErrorResponse> manejarPedidoNoEncontrado(PedidoNoEncontradoException ex) {
        ErrorResponse error = new ErrorResponse(
                ex.getMessage(),
                404,
                LocalDateTime.now()
        );

        return ResponseEntity.status(404).body(error);
    }

    @ExceptionHandler(EstadoPedidoInvalidoException.class)
    public ResponseEntity<ErrorResponse> manejarEstadoPedidoInvalido(
            EstadoPedidoInvalidoException ex) {

        ErrorResponse error = new ErrorResponse(
                ex.getMessage(),
                400,
                LocalDateTime.now()
        );

        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(CarritoVacioException.class)
    public ResponseEntity<ErrorResponse> manejarCarritoVacio(
            CarritoVacioException ex) {

        ErrorResponse error = new ErrorResponse(
                ex.getMessage(),
                400,
                LocalDateTime.now()
        );

        return ResponseEntity.badRequest().body(error);
    }

}
