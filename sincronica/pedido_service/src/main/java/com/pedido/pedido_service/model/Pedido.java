package com.pedido.pedido_service.model;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}
