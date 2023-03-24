package com.example.wzorce.abstractions;


public abstract class AbstractService<R, T>{

    public R execute(T request){
        getValidator().validate(request);
        return executeLogic(request);
    }

    protected abstract R executeLogic(T request);

    protected abstract Validator getValidator();

}


// strategia
// most (bridge)
//