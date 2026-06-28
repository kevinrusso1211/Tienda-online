package com.kevin.tienda_online.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kevin.tienda_online.dto.ActualizarEstadoPedidoRequest;
import com.kevin.tienda_online.dto.PedidoResponse;
import com.kevin.tienda_online.service.PedidoService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/{usuarioId}")
    public PedidoResponse crearPedido(@PathVariable String usuarioId) {
        
        return pedidoService.crearPedido(usuarioId);
    }

    @GetMapping("/{id}")
    public PedidoResponse obtenerPedidoPorId(@PathVariable String id) {
        return pedidoService.obtenerPedidoPorId(id);
    }   

    @PutMapping("/{id}/estado")
    public PedidoResponse cambiarEstadoPedido(@PathVariable String id,
            @RequestBody ActualizarEstadoPedidoRequest request) {
        return pedidoService.cambiarEstadoPedido(id,request.getEstado());
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<PedidoResponse> obtenerPedidosUsuario(
            @PathVariable String usuarioId) {
        return pedidoService.obtenerPedidosUsuario(usuarioId);
    }

    @GetMapping("/total-ventas")
    public BigDecimal obtenerTotalVentas() {
        return pedidoService.obtenerTotalVentas();
    }
    
}
