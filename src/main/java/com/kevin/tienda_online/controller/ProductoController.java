package com.kevin.tienda_online.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevin.tienda_online.dto.ProductoRequest;
import com.kevin.tienda_online.dto.ProductoResponse;
import com.kevin.tienda_online.service.ProductoService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ProductoResponse crearProducto(@Valid @RequestBody ProductoRequest request) {
        return productoService.crearProducto(request);
    }

    @GetMapping
    public List<ProductoResponse> listarProductos() {
        return productoService.listarProductos();
    } 

    @GetMapping("/{id}")
    public ProductoResponse obtenerProductoPorId(@PathVariable String id) {
        return productoService.obtenerProductoPorId(id);
    }

    @PutMapping("/{id}")
    public ProductoResponse actualizarProducto(@PathVariable String id,@Valid @RequestBody ProductoRequest request) {
        return productoService.actualizarProducto(id, request);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable String id) {
        productoService.eliminarProducto(id);
    }

}
