package com.sheffmachine.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    public static final String HELLO_GURUS = "Hello Gurus!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
