package com.example.rmqProducer.model;

public interface RabbitMQProducerService {

    void sendMessage(String message, String routingKey);
}