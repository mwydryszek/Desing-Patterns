package com.example.wzorce.observator;

public class ObservbleMain {

    public static void main(String[] args) {
        EventPublisher eventPublisher = new EventPublisher();
        Subscriber subscriber = new Subscriber();
        Subscriber anotherSubscriber = new Subscriber();
        eventPublisher.subscribe(anotherSubscriber);
        eventPublisher.subscribe(subscriber);
        eventPublisher.sendNotification();
    }

}
