package com.example.wzorce.adapter;

public interface Pageable {

    int size();
    String sortedBy();
    int page();
    boolean isNext();

}
