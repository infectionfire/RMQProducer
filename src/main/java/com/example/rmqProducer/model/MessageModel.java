package com.example.rmqProducer.model;

public class MessageModel {

    private String message;
    private String routingKey;

    public MessageModel(String message, String routingKey) {
        this.message = message;
        this.routingKey = routingKey;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }
}
