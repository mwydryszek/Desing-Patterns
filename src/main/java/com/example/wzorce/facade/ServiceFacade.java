package com.example.wzorce.facade;

public interface ServiceFacade {

    Object create(Object obj);
    Object update(Object obj, Long id);

}
