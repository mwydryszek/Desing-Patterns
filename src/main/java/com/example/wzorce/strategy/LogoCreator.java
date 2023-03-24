package com.example.wzorce.strategy;

public interface LogoCreator {

    boolean supports(Client client);
    void createLogo();

}
