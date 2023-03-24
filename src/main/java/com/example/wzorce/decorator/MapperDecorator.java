package com.example.wzorce.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MapperDecorator implements Mapper{

    private final Mapper mapper;

    @Override
    public String mapToString(Object obj) {

        System.out.println("Before");
        String result = mapper.mapToString(obj);
        System.out.println("After");
        return result;
    }
}
