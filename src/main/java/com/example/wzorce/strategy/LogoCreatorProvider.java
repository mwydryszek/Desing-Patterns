package com.example.wzorce.strategy;

import java.util.Set;

public class LogoCreatorProvider {

    private final Set<LogoCreator> logoCreators = Set.of(
            new IngLogoCreator(),
            new PzuLogoCreator()
    );

    public LogoCreator getLogoCreator(Client client){
        return logoCreators.stream()
                .filter(logoCreator -> logoCreator.supports(client))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
