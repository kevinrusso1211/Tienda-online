package com.kevin.tienda_online.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kevin.tienda_online.dto.PedidoResponse;
import com.kevin.tienda_online.model.EstadoPedido;
import com.kevin.tienda_online.service.PedidoService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/pedidos")
@Tag(name = "Pedidos", description = "Gestión de pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/{usuarioId}")
    public PedidoResponse crearPedido(@PathVariable String usuarioId) {
        return pedidoService.crearPedido(usuarioId);
    }

    @PutMapping("/{id}/estado")
    public PedidoResponse cambiarEstadoPedido(
            @PathVariable String id,
            @RequestParam EstadoPedido estado) {

        return pedidoService.cambiarEstadoPedido(id, estado);
    }

    @GetMapping
    public List<PedidoResponse> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    @GetMapping("/{id}")
    public PedidoResponse obtenerPedidoPorId(@PathVariable String id) {
        return pedidoService.obtenerPedidoPorId(id);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<PedidoResponse> listarPedidosPorUsuario(
            @PathVariable String usuarioId) {

        return pedidoService.listarPedidosPorUsuario(usuarioId);
    }
    
}
