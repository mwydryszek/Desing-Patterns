package com.example.wzorce.strategy;

public class PzuLogoCreator implements LogoCreator{
    @Override
    public boolean supports(Client client) {
        return Client.PZU == client;
    }

    @Override
    public void createLogo() {

    }
}
