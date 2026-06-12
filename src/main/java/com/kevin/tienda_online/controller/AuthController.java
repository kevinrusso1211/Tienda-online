package com.kevin.tienda_online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevin.tienda_online.dto.LoginRequest;
import com.kevin.tienda_online.dto.RegisterRequest;
import com.kevin.tienda_online.dto.UsuarioResponse;
import com.kevin.tienda_online.service.AuthService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Autenticación", description = "Registro e inicio de sesión")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/registrar")
    public UsuarioResponse registrarUsuario(@Valid @RequestBody RegisterRequest request) {
        return authService.crearUsuario(request);
    }

    @PostMapping("/login")
    public String login(@Valid @RequestBody LoginRequest request) {
        return authService.iniciarSesion(request);
    }

}
