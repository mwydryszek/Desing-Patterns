package com.example.wzorce.facade;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Controller {

    private final ServiceFacade service;

    public Object create(Object obj){
        return service.create(obj);
    }

}
