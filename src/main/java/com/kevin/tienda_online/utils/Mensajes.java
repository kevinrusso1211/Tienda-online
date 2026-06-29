package com.kevin.tienda_online.utils;

public class Mensajes {
    private Mensajes(){}


    // Usuario
    public static final String USUARIO_NO_ENCONTRADO = "Usuario no encontrado";
    public static final String USUARIO_YA_EXISTE = "El usuario ya está registrado";
    public static final String CREDENCIALES_INVALIDAS = "Contraseña incorrecta";

    // Producto
    public static final String PRODUCTO_NO_ENCONTRADO = "Producto no encontrado";
    public static final String STOCK_INSUFICIENTE = "Stock insuficiente para el producto: ";

    // Carrito
    public static final String CARRITO_NO_ENCONTRADO = "Carrito no encontrado";
    public static final String CARRITO_VACIO = "Carrito vacio";
    public static final String PRODUCTO_NO_EXISTE_EN_CARRITO = "Producto no encontrado en el carrito";
    public static final String CANTIDAD_INVALIDA = "La cantidad debe ser mayor que cero";

    // Pedido
    public static final String PEDIDO_NO_ENCONTRADO = "Pedido no encontrado";
    public static final String ESTADO_PEDIDO_INVALIDO = "No es posible realizar ese cambio de estado";
    public static final String PEDIDO_YA_PAGADO = "El pedido ya fue pagado";
    public static final String PEDIDO_YA_CANCELADO = "El pedido ya fue cancelado";
    
    public static final String STOK_INSUFICIENTE = "Stock insuficiente";
}
