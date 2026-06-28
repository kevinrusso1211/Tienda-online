package com.kevin.tienda_online.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kevin.tienda_online.dto.ProductoRequest;
import com.kevin.tienda_online.dto.ProductoResponse;
import com.kevin.tienda_online.service.ProductoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;

@Tag(name = "Producto", description = "Operaciones relacionadas con productos")
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PreAuthorize("hasRole('ADMIN')")
    @Operation(summary = "Crear producto", description = "Crear un nuevo producto")
    @PostMapping
    public ProductoResponse crearProducto(@Valid @RequestBody ProductoRequest request) {
        return productoService.crearProducto(request);
    }

    @Operation(summary = "Listar productos", description = "Listar todos los productos")
    @GetMapping
    public List<ProductoResponse> listarProductos() {
        return productoService.listarProductos();
    } 

    @Operation(summary = "Obtener producto por ID", description = "Obtener productopor su ID")
    @GetMapping("/{id}")
    public ProductoResponse obtenerProductoPorId(@PathVariable String id) {
        return productoService.obtenerProductoPorId(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/{id}")
    public ProductoResponse actualizarProducto(@PathVariable String id,@Valid @RequestBody ProductoRequest request) {
        return productoService.actualizarProducto(id, request);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable String id) {
        productoService.eliminarProducto(id);
    }

    @GetMapping("/buscar")
    public List<ProductoResponse> buscarPorNombre(
            @RequestParam String nombre){
        return productoService.buscarPorNombre(nombre);
    }

}
