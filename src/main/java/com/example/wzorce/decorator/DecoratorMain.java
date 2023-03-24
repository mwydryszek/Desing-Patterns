package com.example.wzorce.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        Mapper mapper = new EntityMapper();
        MapperDecorator decorator = new MapperDecorator(mapper);
        MapperDecoratorOther mapperDecoratorOther = new MapperDecoratorOther(decorator);

        String result = mapperDecoratorOther.mapToString("Cos");

        System.out.println(result);
    }

}
