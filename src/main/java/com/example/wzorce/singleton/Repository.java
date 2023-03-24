package com.example.wzorce.singleton;

public class Repository {

    private static Repository instance;

    private Repository() {
    }

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public void print(){
        System.out.println("Działa");
    }

}
