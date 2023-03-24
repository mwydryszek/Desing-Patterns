package com.example.wzorce.adapter;

public class PageableImpl implements Pageable {

    private int size;
    private String sortedBy;
    private int page;
    private boolean isNext;

    @Override
    public int size() {
        return size;
    }

    @Override
    public String sortedBy() {
        return sortedBy;
    }

    @Override
    public int page() {
        return page;
    }

    @Override
    public boolean isNext() {
        return isNext;
    }
}
