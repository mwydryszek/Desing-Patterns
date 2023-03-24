package com.example.wzorce.proxy;


import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class CalculatorProxy implements Calculator {

    private final CalculatorImpl calculator;

    private Map<String, Integer> cache;

    @Override
    public int calculate(String input) {

        if(cache == null){
            cache = new HashMap<>();
        }

        if (cache.containsKey(input)){
            return cache.get(input);
        }

        int result = calculator.calculate(input);

        cache.put(input, result);

        return result;
    }


}
