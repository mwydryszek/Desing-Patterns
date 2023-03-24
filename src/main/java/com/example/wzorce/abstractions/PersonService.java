package com.example.wzorce.abstractions;

public class PersonService extends AbstractService<String, String>{

    @Override
    protected String executeLogic(String request) {
        return null;
    }

    @Override
    protected Validator getValidator() {
        return new PersonValidator();
    }
}
