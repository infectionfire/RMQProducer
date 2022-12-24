package com.example.rmqProducer.producer;

public interface RabbitMQProducerService {

    void sendMessage(String message, String routingKey);
}