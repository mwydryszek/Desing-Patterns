package com.example.wzorce.strategy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PdfCreator {
    private final LogoCreatorProvider logoCreatorProvider;

    public void createPdf(){
        logoCreatorProvider.getLogoCreator(Client.ING).createLogo();
    }

}
