package com.example.productoservice;

import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductorService {

    private final AmqpTemplate customRabbitTemplate;

    public ProductorService(AmqpTemplate customRabbitTemplate) {
        this.customRabbitTemplate = customRabbitTemplate;
    }

    public void enviarListaProductos(List<ProductoDTO> productos) {
        customRabbitTemplate.convertAndSend(
                RabbitMqConfig.EXCHANGE_NAME,
                RabbitMqConfig.ROUTING_KEY,
                productos
        );
        System.out.println("Lista de productos enviada con éxito en formato JSON.");
    }
}
