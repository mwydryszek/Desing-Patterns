package com.example.wzorce.strategy;

public class IngLogoCreator implements LogoCreator {
    @Override
    public boolean supports(Client client) {
        return Client.ING == client;
    }

    @Override
    public void createLogo() {

    }
}
