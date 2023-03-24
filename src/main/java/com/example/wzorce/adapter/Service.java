package com.example.wzorce.adapter;

public class Service {

    public Object getPage(Pageable pageable){
        System.out.println(String.valueOf(pageable));
        return null;
    }

}
