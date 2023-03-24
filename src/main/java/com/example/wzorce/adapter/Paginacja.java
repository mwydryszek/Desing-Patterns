package com.example.wzorce.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paginacja implements Pageable{

    private int wielkosc;
    private String posortowanePo;
    private boolean czyNastepny;

    @Override
    public int size() {
        return wielkosc;
    }
    private int strona;


    @Override
    public String sortedBy() {
        return null;
    }

    @Override
    public int page() {
        return 0;
    }

    @Override
    public boolean isNext() {
        return false;
    }
}
