package com.example.wzorce.proxy;

public class CalculatorImpl implements Calculator {
    @Override
    public int calculate(String input) {
        return input != null ? input.length() : 0;
    }


}
