package com.example.wzorce.facade;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ServiceFacadeImpl implements ServiceFacade {

    private final Validator validator;
    private final Mapper mapper;

    @Override
    public Object create(Object obj) {
        validator.validate(obj);
        // save to database
        return mapper.mapToObject(obj);
    }

    @Override
    public Object update(Object obj, Long id) {
        validator.validate(obj);
        // save update to database
        return mapper.mapToObject(obj);
    }
}
