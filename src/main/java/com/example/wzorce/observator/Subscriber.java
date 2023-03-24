package com.example.wzorce.observator;

public class Subscriber {
    public void receiveNotification(EventPublisher eventPublisher) {
        System.out.println("Nowy film ekipy");
    }
}
