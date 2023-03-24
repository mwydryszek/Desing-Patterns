package com.example.wzorce.adapter;

public class PaginacjaAdapter implements Pageable{

    Paginacja paginacja;


    @Override
    public int size() {
        return paginacja.getWielkosc();
    }

    @Override
    public String sortedBy() {
        return paginacja.getPosortowanePo();
    }

    @Override
    public int page() {
        return paginacja.getStrona();
    }

    @Override
    public boolean isNext() {
        return paginacja.isCzyNastepny();
    }
}
