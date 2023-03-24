package com.example.wzorce.decorator;

public class EntityMapper implements Mapper{

    @Override
    public String mapToString(Object obj){
        System.out.println("Mapping");
        return String.valueOf(obj);
    }



}
