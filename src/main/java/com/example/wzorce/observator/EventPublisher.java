package com.example.wzorce.observator;

import java.util.LinkedHashSet;
import java.util.Set;

public class EventPublisher {

    private final Set<Subscriber> subscribers = new LinkedHashSet<>();

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void sendNotification(){
        subscribers.forEach(subscriber -> subscriber.receiveNotification(this));

    }

}
