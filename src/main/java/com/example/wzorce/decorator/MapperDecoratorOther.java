package com.example.wzorce.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MapperDecoratorOther implements Mapper{

    private final Mapper mapper;

    @Override
    public String mapToString(Object obj) {

        String result = mapper.mapToString(obj);
        result += "decorated";
        return result;
    }
}
